(defproject clj-webdriver-boilerplate "0.7.2"
  :description "clj-web-driver-boilerplate" 
  :url "https://www.github.com/greywolve/clj-webdriver-boilerplate"
  :license {:name "MIT License"
            :url "https://github.com/greywolve/clj-webdriver-boilerplate/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-webdriver "0.7.2"]
                 [org.seleniumhq.selenium/selenium-java "2.53.0"]
                 ; > Starting with 2.53.0 you need to explicitly include HtmlUnitDriver as a dependency to include it.
                 ; > Version number of the driver is now tracking HtmlUnit itself.
                 ; Source: http://www.seleniumhq.org/download/maven.jsp
                 [org.seleniumhq.selenium/selenium-htmlunit-driver "2.52.0"]]
  :eval-in :leiningen)
