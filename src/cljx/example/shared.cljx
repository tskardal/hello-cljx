(ns example.shared)

(defn hello []
  "Hello there!")

(defn log []
  #+clj (println "hello from cljx")
  #+cljs (js/console.log "hello from cljx"))
