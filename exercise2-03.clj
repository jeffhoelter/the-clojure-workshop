(ns exercise.2
  (:require [clojure.string :as str]))

(def supported-currencies #{"Dollar" "Japanese yen" "Euro" "Indian rupee"
                            "British pound"})

(get supported-currencies "Dollar")