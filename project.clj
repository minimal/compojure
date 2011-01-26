(defproject compojure "0.3.2-JETTY7"
  :description "A concise web framework for Clojure"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [commons-codec "1.4"] 
                 [commons-io "1.4"]
                 [commons-fileupload "1.2.1"] 
                 [org.eclipse.jetty/jetty-server "7.2.2.v20101205"]
                 [org.eclipse.jetty/jetty-servlet "7.2.2.v20101205"]
                 [org.eclipse.jetty/jetty-websocket "7.2.2.v20101205"]]
  ;:dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]]
  :aot [compojure
               compojure.control
               compojure.html
               compojure.html.gen
               compojure.html.form-helpers
               compojure.html.page-helpers
               compojure.http
               compojure.http.routes
               compojure.http.request
               compojure.http.response
               compojure.http.session
               compojure.http.servlet
               compojure.http.helpers
               compojure.ns-utils
               compojure.server.common
               compojure.server.jetty
               compojure.str-utils
               compojure.validation])
