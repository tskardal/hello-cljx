(defproject hello-cljx "0.1.0-SNAPSHOT"
  :description "Hello world sample for cljx"
  :url "http://github.com/tskardal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2760"]]  
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[com.keminglabs/cljx "0.5.0"]
                             [lein-cljsbuild "1.0.4"]]}}
  :source-paths ["src/clj" "target/classes"]
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
                           :output-to "resources/public/js/example.js"
                           :output-dir "target/classes"
                           
                           ;; minimal JS optimization directive
                           :optimizations :whitespace

                           ;; generated JS code prettyfication
                           :pretty-print true}}]}  
  :aliases {"cleantest" ["do" "clean," "cljx" "once," "test," "cljsbuild" "test"]})
