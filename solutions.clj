; ptrv
;
; Solutions for the clojure learning site (project) http://www.4clojure.com/

; Double Down
; http://www.4clojure.com/problem/15
(fn [x] (* 2 x))

; Hello World
; http://www.4clojure.com/problem/16
(fn [name] (str "Hello, " name "!"))

; Last Element
; http://www.4clojure.com/problem/19
; restrictions: last
(fn [coll] (peek (vec coll)))

; Penultimate Element
; http://www.4clojure.com/problem/20
(fn [coll] (nth coll (- (count coll) 2)))

; Nth Element
; http://www.4clojure.com/problem/21
(fn [coll n] (get (vec coll) n ))

; Count a Sequence
; http://www.4clojure.com/problem/22
(fn [coll]
  (reduce (fn [x y] (inc x)) 0 coll))

; Reverse a Sequence
; http://www.4clojure.com/problem/23
; restrictions: reverse, rseq
(fn [coll] (reduce conj '() coll))

; Sum It All Up
; http://www.4clojure.com/problem/24
(fn [coll] (reduce + coll))

; Find the odd numbers
; http://www.4clojure.com/problem/25
(fn [coll] (filter odd? coll))

;; Fobinacci Sequence
;; http://www.4clojure.com/problem/26
(fn [n]
  (letfn [(fib [i]
            (if (>= 2 i)
              1
              (+ (fib (dec i)) (fib (- i 2)))))]
    (map fib (take n (iterate #(inc %) 1)))))

;; Palindrome Detector
;; http://www.4clojure.com/problem/27
(fn [x] (= (seq x) (reverse x)))

;; Flatten a sequence
;; http://www.4clojure.com/problem/28
(fn [coll]
  (seq
   (reduce
    (fn my-flatten [v e]
      (if (coll? e)
        (reduce my-flatten v e)
        (conj v e)))
    [] coll)))

;; Get the Caps
;; http://www.4clojure.com/problem/29
(fn [s] (apply str (re-seq #"[A-Z]+" s)))

;; Compress a Sequence
;; http://www.4clojure.com/problem/30
(fn [coll] (map first (partition-by identity coll)))

;; Pack a Sequence
;; http://www.4clojure.com/problem/31
(fn [coll] (partition-by identity coll))

;; Duplicate a Sequence
;; http://www.4clojure.com/problem/32
(fn [coll]
  (reverse
   (reduce #(cons %2 (cons %2 %1)) '() coll)))

;; Replicate a Sequence
;; http://www.4clojure.com/problem/33
(fn [coll n] (mapcat #(concat (repeat n %)) coll))

;; Implement range
;; http://www.4clojure.com/problem/34
(fn [start end] (take (- end start) (iterate inc start)))

;; Let it Be
;; http://www.4clojure.com/problem/36
[x 7 y 3 z 1]

;; Regular Expressions
;; http://www.4clojure.com/problem/37
"ABC"

;; Maximum value
;; http://www.4clojure.com/problem/38
;; restrictions: max, max-key
(fn mymax
  ([x y]
     (if (> x y) x y))
  ([x y & more]
     (reduce mymax (mymax x y) more)))

;; A nil key
;; http://www.4clojure.com/problem/134
(fn nil-val? [k m]
  (and (contains? m k) (nil? (m k))))

;; For the win
;; http://www.4clojure.com/problem/145
(range 1 40 4)

;; Map defaults
;; http://www.4clojure.com/problem/156
(fn [v m] (zipmap m (repeat v)))

;; Comparison
;; http://www.4clojure.com/problem/166
(fn [op a b]
  (cond
   (op a b) :lt
   (op b a) :gt
   :else :eq))

;; Intro to iterate
;; http://www.4clojure.com/problem/45
(range 1 15 3)

;; Factorial fun
;; http://www.4clojure.com/problem/42
(fn [n] (reduce * (range 1 (inc n))))

;; Interleave Two Seqs
;; http://www.4clojure.com/problem/39
;; resetrictions: interleave
(fn [a b]
  (mapcat #(conj [] %1 %2) a b))

;; Interpose a Seq
;; http://www.4clojure.com/problem/40
(fn [sep coll]
  (drop-last
   (mapcat #(conj [] % sep) coll)))

;; Drop Every Nth Element
;; http://www.4clojure.com/problem/41
(fn [coll n]
  (mapcat #(take (dec n) %) (partition-all n coll)))

;; Reverse Interleave
;; http://www.4clojure.com/problem/43
(fn [coll n]
  (apply map list (partition n coll)))

;; Intro into Destructuring
;; http://www.4clojure.com/problem/52
(list c e)
[c e]

;; Advanced Destructuring
;; http://www.4clojure.com/problem/51
(list 1 2 3 4 5)

;; A Half-Truth
;; http://www.4clojure.com/problem/83
(fn [& vars]
  (cond
   (every? true? vars) false
   (some true? vars) true
   :else false))

;; Split a Sequence
;; http://www.4clojure.com/problem/49
(fn [n coll]
  [(take n coll)(drop n coll)])

;; Map Construction
;; http://www.4clojure.com/problem/61
;; restrictions: zipmap
(fn [a b] (apply assoc {} (interleave a b)))

;; Product Digits
;; http://www.4clojure.com/problem/99
(fn [x y]
  (map #(- (int %) (int \0)) (str (* x y))))

;; Re-Implement Iterate
;; http://www.4clojure.com/problem/62
;; restrictions: iterate
(fn iter [f x]
  (cons x (lazy-seq (iter f (f x)))))

;; Read a binary number
;; http://www.4clojure.com/problem/122
(fn [s]
  (Integer/parseInt s 2))
