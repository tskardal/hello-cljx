(ns handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :refer [resources not-found]]
            [example.shared :as shared]
            [views.layout :as l]))

(defroutes home-routes
  (GET "/" [] (l/common [:h1 (str "Hoi? " (shared/hello))]))
  (resources "/")
  (not-found "<h1>Page not found</h1>"))

(def app
  (-> (handler/site home-routes)))
