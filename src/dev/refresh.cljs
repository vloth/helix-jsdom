(ns dev.refresh
  (:require [helix.experimental.refresh :as r]
            [main.app :as app]))

(r/inject-hook!)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn ^:dev/after-load refresh []
  (r/refresh!))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn ^:dev/after-load clear-cache-and-render! []
  (app/render))
