(ns main.app
  (:require ["react-dom/client" :as rdom]
            [helix.core :refer [$]]
            [helix.dom :as d]
            [main.lib :refer [defnc]]
            [main.component :as c]))

(defnc app []
  (d/div (d/h1 "helix-jsdom") 
         ($ c/component-boolean {:value true})))

(defonce root
  (rdom/createRoot 
    (js/document.getElementById "app")))

(defn render []
  (.render root ($ app)))

(defn ^:export init []
  (render))
