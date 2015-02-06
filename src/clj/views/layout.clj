(ns views.layout
  (:require [hiccup.element :refer [javascript-tag]]
            [hiccup.form :refer [form-to]]
            [hiccup.page :refer [html5 include-css include-js]]))

(defn common [& body]
  (html5 {:lang "en"}
   [:head
    [:meta {:charset "utf-8"}]
    (include-css "/css/screen.css")]
   [:body    
    [:div {:class "container"}
     body]
    (include-js  "js/example.js")
    (javascript-tag "example.show();")]))




