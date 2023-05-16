(ns node
  (:require ["jsdom-global" :as jsdom]
            [cljs.test :as test]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn main []
  (jsdom)
  (test/run-all-tests #".*-test$"))
