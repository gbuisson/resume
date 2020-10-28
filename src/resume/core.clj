(ns resume.core
  (:require
   [clojure.java.shell :as shell]
   [resume.data :as resume-data]
   [clojure.string :as string]))

(def pdflatex-bin
  "/usr/local/texlive/2020/bin/x86_64-darwin/pdflatex")

(defn header?
  "returns true if given element is a header kw"
  [k]
  (string/starts-with? (name k) "h"))

(defn org-header [level]
  (format "\n%s " (string/join "" (repeat level "*"))))

(defn header-level
  "Given an HTML header element, get its level as an integer"
  [k]
  (Integer/parseInt (str (last (name k)))))

(defn element
  "Given a hiccup element, and a header renderer fn,
  render it as a string"
  [k header-renderer-fn]
  (cond (header? k) (header-renderer-fn (header-level k))
        (#{:li} k) "\n- "
        (#{:p} k) "\n"
        :else nil))

(defn markdown-header [level]
  (format "\n%s " (string/join "" (repeat level "#"))))

(defn render-element
  "Given an element kw and a target-syntax render it"
  [k target-syntax]
  (case target-syntax
    :org (element k org-header)
    :markdown (element k markdown-header)
    nil))

(defn render
  "generate the resume for a target syntax"
  [element target-syntax]
  (apply str
         (cond
           (coll? element)    (map #(render % target-syntax) element)
           (keyword? element) (render-element element target-syntax)
           :else              element)))

(defn render-brace
  "given a command and an element, render a tex brace"
  [cmd elem]
  (str (apply str \\ cmd "{" elem) "}\n"))

(defn render-tex
  "render a list of elements as tex"
  [elems]
  (case (first elems)
    :doc   {:begin (render-brace "begin" "document")
            :end (render-brace "end" "document")}
    :title "\\maketitle\n"
    :h1    (render-brace "section*" (rest elems))
    :h2    (render-brace "subsection*" (rest elems))
    :h3    (str (apply str "\\subsubsection*{\\emph{" (rest elems)) "}}\n")
    :h4    (str (apply str "\\paragraph*{\\emph{" (rest elems)) "}}\n")
    :ul    {:begin (render-brace "begin" "itemize")
            :end (render-brace "end" "itemize")}
    :li    (str (apply str "\\item " (rest elems)) "\n")
    :p     (str (apply str (rest elems)) "\n\n")
    nil))

(defn escape-latex-strings
  "Given a string, attempt to escape all latex elements"
  [s]
  (string/replace
   (string/replace s #"([&%$#_\{\}~^\\])" "\\\\$1")
   #"\"([^\"]*)\"" "``$1''"))

(defn filter-element [element]
  (map #(if (string? %)
          (escape-latex-strings %) %)
       (filter #(not (coll? %)) element)))

(defn resume-data-as-tex [element]
  (let [level (cond 
               (coll? element) (apply list
                                      (render-tex (filter-element element))
                                      (map resume-data-as-tex (filter coll? element)))
               (string? element) (escape-latex-strings element)
               :else element)]
    (if (:begin (first level))
      (str (:begin (first level)) (apply str (rest level))
           (:end (first level)))
      (apply str level))))

(defn resume-data-as-pdf
  "Given a resume, render itas a pdf file"
  [file]
  (spit file
        (str
         (slurp "tex-header.tex")
         (resume-data-as-tex [:doc [:title] resume-data/resume])))
  (shell/sh pdflatex-bin "-interaction=batchmode" file))

(defn -main [& _args]
  (spit "README.md" (render resume-data/resume :markdown))
  (spit "guillaume-buisson-cv.org" (str (slurp "org-header.org")
                                        (render resume-data/resume :org)))
  (resume-data-as-pdf "guillaume-buisson-cv.tex")
  (println "Done.")
  (System/exit 0))
