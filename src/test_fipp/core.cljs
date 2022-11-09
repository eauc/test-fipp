(ns test-fipp.core
  (:require [fipp.edn]))

(defn main
  []
  (fipp.edn/pprint [1 2 3] {:width 100})
  (cljs.core/*print-fn*
   (with-out-str
     (fipp.edn/pprint [1 2 3] {:width 100}))))
