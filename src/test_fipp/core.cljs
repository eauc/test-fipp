(ns test-fipp.core
  (:require [fipp.edn]))

(enable-console-print!)

(fipp.edn/pprint [123 234 345] {:width 100})
(cljs.core/*print-fn*
 (with-out-str
   (fipp.edn/pprint [123 234 345] {:width 100})))
