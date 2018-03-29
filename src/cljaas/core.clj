(ns cljaas.core
  (:require [cljaas.authn])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (cljaas.authn/login)
  (prn cljaas.authn/*ctx*)
  (cljaas.authn/logout))
