(ns my-test.service.user-service)

(defrecord User [id firstName lastName city])

(defn save
  [userMap]
  (println "Save: " (:id userMap)
           (:firstName userMap)
           (:lastName userMap)
           (:city userMap)
           ))

(defn get
  [id]
  (User. id "Tom" "Brown" "Moscow")
  )

(defn delete
  [id]
  (println "Delete: " (str id)))