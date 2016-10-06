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
)

