(ns my-test.repository.mongorep
  (:require
    [monger.core :as mg]
    [monger.collection :as mc]
    [my-test.resource.mongodb :refer [mongo-db]])
  )

(defn save-user
  [userMap]
  (mc/insert-and-return mongo-db "users" userMap))

(defn get-user
  [id]
  (select-keys
    (mc/find-one-as-map mongo-db "users" {:id id})
    [:id :firstName :lastName :city]))

(defn delete-user
  [id]
  (mc/remove mongo-db "users" {:id id})
  nil)