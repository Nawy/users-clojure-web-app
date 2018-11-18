(ns my-test.repository.mongo-rep
  (:require [monger.core :as mg]
            [monger.collection :as mc]
            [mount.core :refer [defstate]])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(defstate mongo-conn :start (mg/connect))
(defstate mongo-db :start (mg/get-db mongo-conn "clojuretest"))

(defn save-user
  [userMap]
  (let [conn (mg/connect)
        db   (mg/get-db conn "clojuretest")]
    (mc/insert-and-return db "users" userMap)))

