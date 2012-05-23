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
