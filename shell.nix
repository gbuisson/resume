let
  pkgs = import <nixpkgs> { };
  master = import /home/gbuisson/dev/nixpkgs {};
in pkgs.stdenv.mkDerivation {
  name = "curriculum-vitae";
  buildInputs = [
    ( master.clojure.override {
        jdk = master.openjdk11;
    })
    master.openjdk11
    pkgs.texlive.combined.scheme-basic
  ];
}
