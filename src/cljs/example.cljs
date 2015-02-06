(ns example
  (:require [example.shared :as s]))

(defn ^:export show []
  (js/console.log "hello cljs")
  (js/alert (s/hello))
  (s/log))
