(ns testsuite.github-login-no-password 
  (:require [clj-webdriver.taxi :refer :all]
            [clojure.test :refer :all]
            [testsuite.core :refer [browser-up browser-down]]))

(deftest login-to-github 
  (browser-up)
  (to "http://www.github.com")
  (click "a[href*='login']")
  (input-text "#login_field" "someusername")
  (submit "#password")
  (is (= "Some wrong statement" (text ".flash"))) 
  (browser-down)) 
