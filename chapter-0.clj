(ns chapter-0)

(defn meditate [s calm]
  "Does silly tricks with an if and a string"
  (println "Clojure Meditate v1.0")
  (if calm
    (clojure.string/capitalize s)
    (str (clojure.string/upper-case s) "!")))

(meditate
 "test" test)


(def base-co2 382)
(def base-year 2006)

(defn co2-estimate-refactored [year]
  (let [year-diff (- year base-year)]
    (+ base-co2 (* 2 year-diff))))

(co2-estimate-refactored 2020)


(defn co2-estimate [year]
  "Calculates the CO2 level based on the `year` given."
  (+ 382 (* 2 (- year 2006))))

(co2-estimate 2020)


(defn meditate-calmness [s calmness-level]
  (println "Clojure Meditate v2.0")
  (cond (= 10 calmness-level)
        (clojure.string/reverse s)
        (<= 5 calmness-level 9)
        (str (clojure.string/upper-case s) "!")
        (< calmness-level 5)
        (clojure.string/capitalize s)))

(meditate-calmness "test 123" 10)


