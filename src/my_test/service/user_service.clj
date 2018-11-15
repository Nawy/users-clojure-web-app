(ns my-test.service.user-service
  (:require [my-test.repository.mongo-rep :as mongo]))

(defrecord User [id firstName lastName city])

(defn save
  [userMap]
  (mongo/save-user userMap))

(defn get
  [id]
  (User. id "Tom" "Brown" "Moscow"))

(defn delete
  [id]
  (println "Delete: " (str id)))