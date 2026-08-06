(ns resume.core-test
  (:require
   [clojure.test :refer :all]
   [resume.core :as core]))

(deftest pdflatex-is-resolved-from-path
  (let [calls (atom [])]
    (with-redefs [clojure.java.shell/sh
                  (fn [& args]
                    (swap! calls conj args)
                    {:exit 0 :out "ok" :err ""})]
      (is (= 0 (:exit (core/run-pdflatex! "resume.tex"))))
      (is (= [["pdflatex"
               "-halt-on-error"
               "-interaction=nonstopmode"
               "resume.tex"]]
             @calls)))))

(deftest pdflatex-failure-is-not-silenced
  (with-redefs [clojure.java.shell/sh
                (fn [& _]
                  {:exit 1 :out "compiler output" :err "compiler error"})]
    (let [error (try
                  (core/run-pdflatex! "broken.tex")
                  nil
                  (catch clojure.lang.ExceptionInfo exception
                    exception))]
      (is (= 1 (:exit (ex-data error))))
      (is (= "pdflatex" (:command (ex-data error))))
      (is (re-find #"compiler error" (.getMessage error))))))

(deftest pdf-generation-runs-two-passes
  (let [calls (atom [])
        output (java.io.File/createTempFile "resume-core-test" ".tex")]
    (try
      (with-redefs [core/run-pdflatex!
                    (fn [file]
                      (swap! calls conj file)
                      {:exit 0 :out "" :err ""})]
        (is (= (.getPath output)
               (core/resume-data-as-pdf (.getPath output))))
        (is (= [(.getPath output) (.getPath output)] @calls)))
      (finally
        (.delete output)))))