# hello-cljx

A sample project using lein-cljx to share common code between Clojure and ClojureScript

To run the sample you'll need to run these leiningen commands in order:

* lein cljx once
* lein cljsbuild once
* lein ring server

The result is a webapp that uses code from the namespace ```example.shared``` in both the server siden handler and the client side ClojureScript code.
