(ns clojure-dap.main
  (:require [clojure.pprint :as pp]))

(def run [opts] (pp/pprint opts) (println "Hello, World!"))
