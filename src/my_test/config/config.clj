(ns my-test.config.config
  (:require [monger.core :as mg]
            [monger.collection :as mc]
            [io.pedestal.http :as server]
            [mount.core :as mount]
            [mount.core :refer [defstate]]
            [my-test.server :refer [runnable-service]])
  (:import [org.bson.types ObjectId]
           [com.mongodb DB WriteConcern]))

(defstate mongo-conn :start (mg/connect))
(defstate mongo-db :start (mg/get-db mongo-conn "clojuretest"))
(defstate pedestal-server :start (server/start runnable-service))

(defn app-run []
  (mount/start #'mongo-conn #'mongo-db #'pedestal-server))
