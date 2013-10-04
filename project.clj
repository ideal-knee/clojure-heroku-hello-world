(defproject clojure-heroku-hello-world "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html" }
            :dependencies [[org.clojure/clojure "1.5.1"]
                           [ring/ring-jetty-adapter "1.1.6"] ]
            :uberjar-name "clojure-heroku-hello-world-standalone.jar"
            :min-lein-version "2.0.0" )
