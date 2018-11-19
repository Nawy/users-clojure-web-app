(ns my-test.app
  (:require [mount.core :as mount]
            [my-test.repository.mongorep :refer [mongo-conn]]
            [my-test.repository.mongorep :refer [mongo-db]]
            [my-test.server :refer [pedestal-server]]))


(defn app-run []
  (mount/start #'mongo-conn #'mongo-db #'pedestal-server))

(defn -main
  "The entry-point for 'lein run'"
  [& args]
  (println "\nCreating your server...")
  (app-run))
