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