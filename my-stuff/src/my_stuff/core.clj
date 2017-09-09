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
(defn triplicate [f] (fn [f] (dotimes [n 3] f)))
(defn triplicate [f] ((f) (f) (f)))

(triplicate (greet))



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

(defn triplicate2 "trip2" [f & args]
  (f & args)
  (triplicate [& f args])
)
(triplicate2 greeting "test")




