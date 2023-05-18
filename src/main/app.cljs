(ns main.app
  (:require ["react-dom/client" :as rdom]
            [helix.core :refer [$ <>]]
            [helix.dom :as d]
            [main.lib :refer [defnc]]))

(defnc component-boolean [{:keys [value]}]
  (<> (if value "yes" "no")))

(defonce root (atom nil))

(defnc app []
  (d/div (d/h1 "helix-jsdom")
         ($ component-boolean {:value true})))

(defn make-root! []
  (or @root
      (reset! root
              (rdom/createRoot
               (js/document.getElementById "app")))))

(defn render []
  (.render ^js (make-root!)
               ($ app)))

(defn ^:export init []
  (render))
