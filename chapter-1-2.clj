(ns chapter.1
  (:require [clojure.string :as str]))

(defn encode-letter-from-string
  [s x]
  (let [code (Math/pow (+ x (int (first (char-array s)))) 2)]
    (str "#" (int code))))

(encode-letter-from-string "a" 2)

(defn encode
  [s]
  (let [number-of-words (count (str/split s #" "))]
    (str/replace s #"\w"
                 (fn [s] (encode-letter-from-string s number-of-words)))))

(encode "Super secret.")


(defn decode
  [s]
  (let [number-of-words (count (map str/trim (str/split s #" ")))]
    (clojure.string/replace s #"\#\d+" (fn [s] (decode-character-from-number s number-of-words)))))

(defn decode-character-from-number
  [n offset]
  (str (char (- (Math/sqrt (Integer/parseInt (subs n 1))) offset))))

(decode "#7225#14161#12996#10609#13456 #13689#10609#10201#13456#10609#13924.")


// scratch work 
(rest (map str/trim (str/split "#7225#14161#12996#10609#13456 #13689#10609#10201#13456#10609#13924" #"#")))
(char (- (Math/sqrt 7225) 2))
(map #(Math/sqrt %) (map #(Integer/parseInt %) (rest (map str/trim (str/split "#7225#14161#12996#10609#13456 #13689#10609#10201#13456#10609#13924" #"#")))))
(map #(Math/sqrt %))
(decode "#7225#14161#12996#10609#13456 #13689#10609#10201#13456#10609#13924")
(str (char 74))
(count `(74.0 108.0 103.0 92.0 105.0 106.0 92.0 90.0 105.0 92.0 107.0))
