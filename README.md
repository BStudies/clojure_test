# Clojure

## What is Clojure?

## Hello world
This is a simple hello world programm.

`(defn hello-world "This is a simple hello world function that takes no parameters"
  [] 
  (println (str "Hello " "World")))`
  
## Data types
1. Integers - In clojure, Integers consist of Whole numbers. ex: 1 2 3 4.
2. Boolean - Just like in other languages, Booleans are just True and False.
3. Char - This type represents a sigle character. ex: a b c
4. String - This type represents a chain of characters. ex: "Hell World"
5. Nil - This defines a non-exitent value such as NULL in other programming languages.
6. Atom - This type is used for concurrent programming. They can only be modified by special functions that check that if its value was altered.
7. Floating Point - These differ from integers in that they can hold decimal values. ex: 1.2 3.5

## Operators
1. '+' (plus) - Adds multiple numbers.

`;: will evaluate to 3
(+ 1 2 )
;; will evaluate to 6
(+ 1 2 3)`

2. '-' (minus) - Subtract  multiple numbers.

`;: will evaluate to -1
(- 1 2 )
;; will evaluate to 5
(- 10 2 3)`

3. '*' (multiplication) - Multiplies multiple numbers.

`;: will evaluate to 4
(* 2 2 )
;; will evaluate to 60
(* 10 2 3)`

4. '/' (division) - Divides multiple numbers.

`;: will evaluate to 5
(/ 10 2 )
;; will evaluate to 1
(- 10 2 5)`

5. inc - Increase a value by one.

`;; Evaluate to 2
(inc 1)`

6. dec - Decrease a value by one.

`;; Evaluate to 0
(dec 1)`

7. max - return the largest value of the numbers passed in.

`;;returns 3
(max 1 2 3)`

7. min - return the smallest value of the numbers passed in.

`;;returns 1
(min 100 22 39)`

9. rem - evaluates to the remainder of diving multiple numbers

`;;evaluates to 1
(rem 11 10)`

## Loops
1. while- Do the code given while the condition is true.
2. dotimes -Do the code given n number of times. n being the number supplied 

;;prints 0..2`
(dotimes [n 3]
  (println n))`

3. doseq - similar to 'for Each' in other programming languages

`;;prints 
;;2
;;3
;;4
(doseq [n [1 2 3 ]] 
  (println (inc n))
`
4. loop - similar to a foor loop in other languages


## Conditionals
1.if

`(if (= 1 1)
  (println "values equal to each other")
  (println "values are not equal to each other"))
  `
  
2.if-do - similar to above but can run multiple lines of code

`(if (= 1 1)
      (do(println "values equal to each other")
         (println "true"))
      (do(println "values are notequal to each other")
         (println "false")))
`

3.case - similar to switch statements in other languages

`
 (def value 7) 
   (case value 15 (println "x is 15")
      99 (println "the value is 99")
      (println "the value is not 15 or 99")))
`

4.cond - similar to if-else in other languages

`
(def value 15)
   (cond
      (= x 15) (println "value is 15")
      (= x 99)(println "value is 99")
      :else (println "value is not defined"))
`

## Data Structrures
1.List - A list is used to store many values.

`(def a (list 1 2 3 3))
;;(1 2 3)`
2.Set - A set stores unique values from a list.

`(set a)
;;#{1 2 3 4}`
3.Vectors - similar to arrays in that indexes are contiguous.

`(vector 1 2 3)
;; [1 2 3]`

4.Map - it is used to store key value pairs

`
(hash-map "one" "1" "two" "2" "three" "3")
;;{"three" "3", "two" "2", "one" "1"}
`

## Functions and Variables


