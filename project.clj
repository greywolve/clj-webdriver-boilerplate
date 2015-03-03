(defproject clj-webdriver-boilerplate "0.1.0-SNAPSHOT"
  :description "clj-web-driver-boilerplate" 
  :url "http://www.github.com/greywolve/clj-webdriver-boilerplate"
  :license {:name "MIT License"
            :url "https://github.com/greywolve/clj-webdriver-boilerplate/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-webdriver "0.6.1"
                  :exclusions [org.seleniumhq.selenium/selenium-server]]
                 [org.seleniumhq.selenium/selenium-server "2.45.0"]]
  :eval-in :leiningen)
