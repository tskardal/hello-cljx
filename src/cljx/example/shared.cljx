(ns example.shared)

(defn show []
  #+clj (println "hello from cljx")
  #+cljs (js/console.log "hello from cljx"))
