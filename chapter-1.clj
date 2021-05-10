(ns chapter-1)

(defn encode-letter-from-string
  [s x]
  (let [code (Math/pow (+ x (int (first (char-array s)))) 2)]
    (str "*" (int code))))

(encode-letter-from-string "a" 2)

(defn encode
  [s]
  (let [number-of-words (count (clojure.string/split s #" "))]
    (clojure.string/replace s #"\w"
                            (fn [s] (encode-letter-from-string s number-of-words)))))

(encode "Super secret")


