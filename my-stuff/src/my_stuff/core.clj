(ns my-stuff.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(println
  (+ 1 1)
)
  (println (
    .toLowerCase(
      .toUpperCase "test"
    )
  )
)

(println(
  map (
    fn [x] (
      .toUpperCase x
      )
    )
    ; ["Dasher" "Dancer" "Prancer"]
    (.split "Dasher Dancer Prancer" " "))
)
; (= vec ["Dasher" "Dancer" "Prancer"])
; (println (vec ))

(println [])

(def x 5)
(def x 6)
(println x)


; allows for doc use
(require '[clojure.repl :refer :all])
(+ 7654 1234)
(/ (+ (+ 7 (* 3 4)) 5) 10)
(doc rem)
(doc mod)
; clojure.stacktrace/e

(defn greet [] println "Hello")
(greet)
(def greet (fn [] (println "Hello")))
(greet)
(def greet #(println "Hello"))
(greet)

(defn greeting 
  ([] (str "Hello, World")) 
  ([x] (str "Hello, " x "!")) 
  ([x y] (str x", "y"!"))
)
(assert (= "Hello, World" (greeting)))
(assert (= "Hello, Clojure!" (greeting "Clojure")))
(assert (= "Good morning, Clojure!" (greeting "Good morning" "Clojure")))

(defn do-nothing [x] identity x)
(assert (= "test" (do-nothing "test")))
(assert (= 1 (do-nothing 1)))


; 5) Define a function
;  always-thing which 
;  takes any number of arguments, 
;  ignores all of them, and returns
;   the keyword :thing.


(defn always-thing [& params] identity :thing)
(assert (= :thing (always-thing "test")))
(assert (= :thing (always-thing :a)))
(assert (= :thing (always-thing 'cat)))
(assert (= :thing (always-thing 4)))


; 6) Define a function 
; make-thingy which takes a 
; single argument x. It should 
; return another function, 
; which takes any number of 
; arguments and always returns x.


(defn make-thingy [x] (fn [& args] (identity x)))
(let [n (rand-int Integer/MAX_VALUE)
      f (make-thingy n)]
  (assert (= n (f)))
  (assert (= n (f :foo)))
  (assert (= n (apply f :foo (range)))))
; find out how to use constantly with make-thingy
; for now this works


; 7) Define a function triplicate 
; which takes another function 
; and calls it three times, 
; without any arguments.

(dotimes [n 3] (greet))
(
    defn triplicate [f]
    ; #(dotimes [n 3] (f))
    (println "first")
    (f)
    (println "second")
    (f)
    (println "third")
    (f)
)
(triplicate greeting)



; 8) Define a function 
; opposite which takes a 
; single argument f. 
; It should return another 
; function which takes any number 
; of arguments, applies f on 
; them, and then calls not on 
; the result. The not function 
; in Clojure does logical negation.
; In Clojure, this is the 
; complement function.

; not sure if this is working
(defn opposite [f] identity(
    fn [& args ] (
      complement (f)
    )
  )
)
; (assert (= false (opposite true)))





; 9) Define a function 
; triplicate2 which takes 
; another function and any 
; number of arguments, then calls 
; that function three times on 
; those arguments. Re-use the 
; function you defined in the 
; earlier triplicate exercise.

; not sure about this one
; (defn triplicate2 "trip2" [f]
;   (println "Executing f")
;   (println f)
;   (println args)
;   (fn [args] (f args))
;   ; [f & args]
;   ; (triplicate [& f args])
; )
; (triplicate2 greeting "test")


; 10) Using the java.lang.Math 
; class (Math/pow, Math/cos, Math/sin, Math/PI), 
; demonstrate the following mathematical facts: * 
; The cosine of pi is -1 *
;  For some x, sin(x)^2 + cos(x)^2 = 1
(= -1.0 (Math/cos Math/PI))
(def x 10)
(def y (Math/pow (Math/sin x) 2))
(def z (Math/pow (Math/cos x) 2))
(= 1.0 (+ y z))


; 11) Define a function that takes an 
; HTTP URL as a string, fetches that URL 
; from the web, and returns the content as a string.

; (def webText (java.net.URL/openStream "http://www.w3.org"))
; (def url (java.net.URL "http://www.w3.org"))

; (java.net.URL/constructor "http://www.w3.org")

; (java.net.URL. "url")
; (.java.net.URL rnd)
; (def webText (java.net.URL/openConnection "http://www.w3.org"))














; two sum, given an array of integers, return indecies of
; of two numbers that add to target
; (def myVec [1 2 3 4 5 6 7 8 9])
; loop through array
; (into #{} arr)



; builds a map of numbers and their opposites based on a sum value

; (use 'clojure.contrib.trace)


; (defn buildMapSumOpposites [myVec sumValue] (
;   (def myHash {})
;   (println "created hash hit loop")
;   (println myHash)
;   ; (for [x myVec] (def myHash (assoc myHash x (- sumValue x))))
;   (def myHash (assoc myHash 3 (- sumValue 3)))
;   (println myHash)
;   ; (println myHash)
;   identity myHash
; ))



; converts vector to map of elements and indicies 
(defn buildMap [vec] (
  (def myMap {})
  (doseq [[i e] (map-indexed vector vec)] 
    (def myMap (assoc myMap e i)))
  (identity myMap)
))

(assert (= {3 0, 2 1, 1 2} (buildMap [3 2 1])) "build map")



; (defn buildMapSumOpposites [vec sumVal] (
;   (def myMap {})
;   (doseq [e vec] 
;     (def myMap (assoc myMap e (- sumVal e))))
;   ; (println myMap)
;   (identity myMap)
; ))
; (assert (= {3 1, 2 2, 1 3} (buildMapSumOpposites [3 2 1] 4)))





; (dotrace [buildMapSumOpposites] (buildMapSumOpposites [1 2 3] 4))

; ; searches for index of two values that sum to given
; (defn findSumPair [myVec myHash sumValue] (
;   (doseq myVec)
; ))
; (assert (= [0 1] (buildMapSumOpposites [3 2 1] {3 1, 2 2, 1 3} 4)))


(defn findPair [myHash sumVal] (
  (def myHashKeys (keys myHash))
  ; (println myHashKeys)
  ; (def opposites [])
  (def indicies [])
  (doseq [k myHashKeys] 
    (do 
      (def opposite (- sumVal k))
      (println opposite)
      (if (get myHash opposite) (conj indicies (get myHash k)))
    )
  )
  (println indicies)
))
(assert (= [0 1] (findPair (buildMap [3 2 1]) 4)))


; (defn twoSum [vec sumValue] (
;   (def myHash (buildMap vec))
;   identity (findPair vec myHash sumValue)
;   )
; )
; (assert (= [0 1] (twoSum [3 2 1] 4)))

; (def myVec [1 2 3 4 5 6 7 8 9])
; (def sumVal 10)
; (twoSum myVec sumVal)






