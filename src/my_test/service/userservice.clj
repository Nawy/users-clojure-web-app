(ns my-test.service.userservice
  (:require [my-test.repository.mongorep :as mongo]))

(defrecord User [id firstName lastName city])

(defn save
  [userMap]
  (mongo/save-user userMap))

(defn get
  [id]
  (map->User (mongo/get-user id)))

(defn delete
  [id]
  (mongo/delete-user id))