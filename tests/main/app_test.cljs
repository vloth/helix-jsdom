(ns main.app-test
  (:require ["@testing-library/react" :as tlr]
            [clojure.test :refer [deftest is use-fixtures]]
            [helix.core :refer [$]]
            [main.app :as app]))

(defn setup-root [f]
  (f)
  (tlr/cleanup))

(use-fixtures :each setup-root)

(deftest a-component-test
  (let [container (tlr/render ($ app/component-boolean {:value false}))
        div       (.getByText container "no")]
      (is (= "no" (.-textContent div)))))
