(ns my-test.repository.mongorep
  (:require
    [monger.core :as mg]
    [monger.collection :as mc]
    [mount.core :refer [defstate]])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(defstate mongo-conn :start (mg/connect))
(defstate mongo-db :start (mg/get-db mongo-conn "clojuretest"))

(defn save-user
  [userMap]
  (mc/insert-and-return mongo-db "users" userMap))

