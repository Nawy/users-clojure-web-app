(ns my-test.repository.mongo-rep
  (:require [monger.core :as mg]
            [monger.collection :as mc])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(defn save-user
  [userMap]
  (let [conn (mg/connect)
        db   (mg/get-db conn "clojuretest")]
    (mc/insert-and-return db "users" userMap)))

