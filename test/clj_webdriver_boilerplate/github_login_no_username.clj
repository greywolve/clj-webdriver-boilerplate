(ns clj-webdriver-boilerplate.github-login-no-username  
  (:require [clj-webdriver.taxi :refer :all]
            [clojure.test :refer :all]
            [clj-webdriver-boilerplate.core :refer [browser-up browser-down]]))

(deftest login-to-github-no-username 
  (browser-up)
  (to "http://www.github.com")
  (click "a[href*='login']")
  (input-text "#password" "your-password")
  (submit "#password")
  (is (= "Incorrect username or password." (text ".flash")))
  (browser-down))

