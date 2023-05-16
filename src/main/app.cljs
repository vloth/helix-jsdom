(ns main.app
  (:require ["react-dom/client" :as rdom]
            [helix.core :refer [$ <>]]
            [helix.dom :as d]
            [main.lib :refer [defnc]]))

(defnc component-boolean [{:keys [value]}]
  (<> (if value "yes" "no")))

(defnc app []
  (d/div (d/h1 "memento") 
         ($ component-boolean {:value true})))

(defonce root
  (rdom/createRoot (js/document.getElementById "app")))

(defn render []
  (.render root ($ app)))

(defn ^:export init []
  (render))
