(ns yaml.core
 (:require [clojure.java.io :as io]
           [yaml.reader :refer [parse-string]]
           [yaml.writer :refer [generate-string]]))

(defn- safe-read
  "Try and read a file. If it does not exist then return nil rather
   than an exception"
  [f]
  (when (.exists (io/file f))
    (slurp f)))

(defn from-file
  "Reads a YAML file and returns the decoded result"
  ([f]
    (from-file f false))
  ([f keywords]
  (when-let [contents (safe-read f)]
    (parse-string contents keywords))))