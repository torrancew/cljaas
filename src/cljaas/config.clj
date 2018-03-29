(ns cljaas.config
  (:import [javax.security.auth.login Configuration])
  (:gen-class
    :name cljaas.authn.Config
    :extends javax.security.auth.login.Configuration
    :init init
    :main false
    :state state
    :constructors {[clojure.lang.Seqable] []}))

(defn -init
  [modules]
  (vector [] modules))

(defn -getAppConfigurationEntry
  [this _]
  (into-array (.state this)))
