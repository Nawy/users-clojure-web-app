(ns my-test.resource.mongodb
  (:require [monger.core :as mg]
            [mount.core :refer [defstate]]
            ))

(defstate mongo-conn :start (mg/connect))
(defstate mongo-db :start (mg/get-db mongo-conn "clojuretest"))