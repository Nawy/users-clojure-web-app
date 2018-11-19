(ns my-test.service.userservice
  (:require [my-test.repository.mongorep :as mongo]))

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