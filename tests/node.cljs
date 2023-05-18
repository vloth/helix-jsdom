(ns node
  (:require ["global-jsdom" :as global-jsdom]
            [cljs.test :as test]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn main []
  (global-jsdom)
  (test/run-all-tests #".*-test$"))
