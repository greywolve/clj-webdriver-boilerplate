#Clojure acceptance testing boilerplate for the [clj-webdriver](https://github.com/semperos/clj-webdriver)

Taken from Sean Corfield's [blog post](http://corfield.org/blog/post.cfm/automated-browser-based-testing-with-clojure) 
"Automated Browser-based Testing with Clojure".

##Requirements
- [Leiningen](https://github.com/technomancy/leiningen) 2.0.0 or higher
- [Selenium Chrome Driver](http://code.google.com/p/selenium/wiki/ChromeDriver) on your path if you wish to test with Chrome

##Install

```
git clone git@github.com:greywolve/clj-webdriver-boilerplate.git
cd clj-webdriver-boilerplate
lein deps
```

##Usage

To run all tests in a single browser session (much faster):

```
lein with-browser test
```

Otherwise just use ```lein test```

To use in the REPL:

```
(use 'testsuite.core)
(use 'clojure.test)
(use 'clj-webdriver.taxi)
(browser-up)
(to "http://www.github.com")
```

There are two example tests in ```test/testsuite/```

##Choose a different browser

Look in ```src/testsuite/core.clj``` 

##More info

- [clj-webdriver wiki](https://github.com/semperos/clj-webdriver/wiki)
- Sean Corfield's [blog post](http://corfield.org/blog/post.cfm/automated-browser-based-testing-with-clojure)

##Credit

All credit goes to [Sean Corfield](http://corfield.org/), thanks for showing your setup :)











