(ns main.component
  (:require [helix.core :refer [<>]]
            [main.lib :refer [defnc]]))

(defnc component-boolean [{:keys [value]}]
  (<> (if value "yes" "no")))
