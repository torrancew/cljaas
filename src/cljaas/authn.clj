(ns cljaas.authn
  (:require [cljaas.config :as config])
  (:import (javax.security.auth.login AppConfigurationEntry
                                      AppConfigurationEntry$LoginModuleControlFlag
                                      LoginContext)))

(def ^:dynamic *ctx*
  (new LoginContext
       "cljaas"
       nil nil
       (new cljaas.authn.Config
            [(new AppConfigurationEntry
                  "com.sun.security.auth.module.UnixLoginModule"
                  AppConfigurationEntry$LoginModuleControlFlag/REQUIRED
                  {"debug" "true"})])))

(defn login
  []
  (.login *ctx*))

(defn logout
  []
  (.logout *ctx*))
