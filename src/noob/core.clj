(ns noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, this is my first clojure app!")
  (if true
    (do (println "this is the true statement")
    (println "this is the true statement 2")
    (println "this is the true statement 3"))
    (println "this is the false statement")
  )
  (println "first argument : " (first args))
  (when (= "test" (first args)) (do (println "the when is printing this because the first arg is test")) )

  (def first-named-value ["arrayitem1" "arrayitem2"])

  (println first-named-value)
  (println "First value: " (first first-named-value))

  (def env :test)
  (if (= env :test) (println "We are in test") (println "we are not in test"))

  (defn message-environment [env] (str "the env passed is " (if (= env :test) "test" "not test")))
  (println (message-environment :live))
  (println (message-environment :test))

  (def mymap {:live "Live Environment" :test "Test environment"})
  (println (get mymap :live) )
  (println (get mymap :test) )

  (defprotocol BarkingDog "this is a barking dog" (bark [this] "dog bark"))
    

  (def callbacks {:cba (fn [x] (* x x ))})
  (println ((get callbacks :cba) 3))
  (println ((callbacks :cba) 2))
  (println ((:cba callbacks 5) 2))
  (println ((:cbb callbacks (fn [x] (+ 1 x))) 2))

(def hashset #{"key1" "key2" "key3"})
    (println hashset)

  (def alist
   ;; This is a list called list
   '(1 2 3 4 5 6))
   ;; print the list element number 3 (4th position)
  (println (nth alist 3))



(println "what is happening here")

  (defn myprint
  "My print doesn't print but adds a dash before the argument"
   [a] (str "-" a))
  (defn loop-print [& x] (map myprint x))
  (println (loop-print "Testing" "the map function" "with the rest parameter" "to reuse the same function over" "and over"))


    
(defn codger-communication
  [whippersnapper]
(str "Get off my lawn, " whippersnapper "!!!"))

(defn codger
   [& whippersnappers]
  (map codger-communication whippersnappers))
(println (codger "Billy" "Anne-Marie" "The Incredible Bulk"))
(map println "Test" "Billy" "Anne-Marie" "The Incredible Bulk")
(dorun (map println "Test" "Billy" "Anne-Marie" "The Incredible Bulk")) ;; not printing!
(doseq [txt '("Test" "Billy" "Anne-Marie" "The Incredible Bulk")] (println txt )) ;; foreach loop
)


