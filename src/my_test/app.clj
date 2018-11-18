(ns my-test.app
  (:require [my-test.config :refer [app-run]] ))

(defn -main
  "The entry-point for 'lein run'"
  [& args]
  (println "\nCreating your server...")
  (app-run))
