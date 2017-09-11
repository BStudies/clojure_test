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
  (println (inc n))`
  
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

### How to define a function 
 A function is defined as follows 
 
 `(defn Hello-world
 "Some description"
 [x]
 (println x))`
 
 * Defining functions
    * All of these are equivlent
        ```
        (defn greet [] println "Hello")
        (def greet (fn [] (println "Hello")))
        (def greet #(println "Hello"))
        ```

The first line is where you name the function. The string that follows is an optional parameter to briefly describe what the fucntion does. if you run `(doc Hello-world)`, the description will be return. this is good for documentation purposs. Next are the paramaters and lastly the code itself that runs when the function is called.

* Closure utilizes Prefix Operation Notation. 
    Regular: 2+3
    Prefix: + 2 3
* Prefix is a bit easier on the computer in terms of the order of operations.


### Anonymous Functions
there are also anonymous functions in clojure and can be defined as follows
`(fn [value] (+ 2 value))`

## How to define a variable
A variable can be defined as follows

`(def a 10)
;; the value of a is now 10


* Defining functions with different argument lengths
    ```
    (defn greeting 
        ([] (str "Hello, World")) 
        ([x] (str "Hello, " x "!")) 
        ([x y] (str x", "y"!"))
    )
    ```

* Testing 
    (assert (= "Hello, World" (greeting)))


* Using java (not javascript)
    * from java.lang.Math
        ```
        (= -1.0 (Math/cos Math/PI))
        ```



`
## Installation

* Mac
    ```
    brew update && brew cask install java
    brew install leiningen
    ```
* Windows with git bash
    ```
    curl -O https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
    ./lein
    ```
    
    
## Usage

* Terminal environment
    ```
    lein repl
    ```
* create a project
    ```
    lein new app {APP_NAME} 
    ```
    

### Bugs

* The twoSum function works, however an exception is thrown when the function completes.



### Any Other Sections
### That You Think
### Might be Useful

From the three days working on this it seems as though Clojure has problems implementing basic functionality such as looping over a vector and executing code. Because clojure is a functional language, it deals a lot with transformations easily. However if one needs to do looping and using indexing it seems to be far more complicated than it needs to be. 

We were also unable to find a good resource for documentation. Sure the examples provided by closure documentation show extreemly specific solutions to extreemly specific problems. It does not seem to be very applicable to simple tasks that one needs in a language. 

The error messages are not very helpful and are verbose. When googling the error message, discussions of seemily unrelated complex topics pop up which does not seem beneficial. One way around this is to user assertions however then the problems can get moved to a complex exception.

I am sure closure has great niche applications however I believe the complexity of the code is unnecessary.





## License

Copyright © 2017 

Distributed under the Eclipse Public License either version 1.0
