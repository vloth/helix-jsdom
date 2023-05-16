(ns main.app-test
  (:require ["@testing-library/react" :as tlr]
            [clojure.test :refer [deftest is  use-fixtures]]
            [helix.core :refer [$]]
            [main.app :as app]))

(defn setup-root [f]
  (f)
  (tlr/cleanup))

(use-fixtures :each setup-root)

(defn text [el] (.-textContent el))

(deftest a-component-test
  (tlr/render ($ app/component-boolean {:value false}))
  (let [div (.getByText tlr/screen "no")]
    (is (= (text div) "no"))))
