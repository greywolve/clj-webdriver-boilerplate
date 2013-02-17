(ns leiningen.with-browser
  (:require [testsuite.core :refer :all]
            [leiningen.core.main :as main]))

(defn ^:higher-order with-browser
  "Run a (test) task with a browser already open."
  [project task-name & args]
  (browser-up)
  (-> (Runtime/getRuntime)
      (.addShutdownHook
       (proxy [Thread] []
         (run [] (browser-down :force true)))))
  (main/apply-task (main/lookup-alias task-name project)
                   project
                   args))
