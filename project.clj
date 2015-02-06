(defproject hello-cljx "0.1.0-SNAPSHOT"
  :description "Hello world sample for cljx"
  :url "http://github.com/tskardal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2657"]
                 [compojure "1.3.1"]
                 [javax.servlet/servlet-api "2.5"]
                 [ring/ring-core "1.3.2"]
                 [hiccup "1.0.5"]]
 
  :source-paths ["src/clj" "target/classes"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[com.keminglabs/cljx "0.5.0"]
                             [lein-cljsbuild "1.0.4"]
                             [lein-ring "0.9.1"]]
                   :ring {:handler handler/app}}}
  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :clj}

                  {:source-paths ["src/cljx"]
                   :output-path "target/classes"
                   :rules :cljs}]}
  :cljsbuild {:builds
              [{;; CLJS source code path
                :source-paths ["src/cljs" "target/classes"]
                :jar true

                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "target/classes/public/js/example.js"
                           :output-dir "target/classes"
                           
                           ;; minimal JS optimization directive
                           :optimizations :whitespace

                           ;; generated JS code prettyfication
                           :pretty-print true}}]})
