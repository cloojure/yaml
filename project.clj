(defproject tupelo/yaml "1.1.0"
  :description "A YAML library for Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.flatland/ordered "1.5.7"]
                 [org.yaml/snakeyaml "1.23"]
                ;[org.snakeyaml/snakeyaml-engine "1.0"]
                ]

  :java-source-paths ["src-java"])
