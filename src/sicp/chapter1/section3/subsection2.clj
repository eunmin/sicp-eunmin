(ns sicp.chapter1.section3.subsection2
  (:require [sicp.chapter1.section3.subsection1 :refer [sum]]))

(fn [x] (+ x 4))

(fn [x] (/ 1.0 (* x (+ x 2))))

(defn pi-sum [a b]
  (sum (fn [x] (/ 1.0 (* x (+ x 2))))
       a
       (fn [x] (+ x 4))
       b))

(defn integral [f a b dx]
  (* (sum f
          (+ a (/ dx 2.0))
          (fn [x] (+ x dx))
          b)
     dx))

(defn plus4 [x]
  (+ x 4))

(def plus4 (fn [x]
             (+ x 4)))

(defn square [x]
  (* x x))

((fn [x y z] (+ x y (square z))) 1 2 3)

(defn f [x y]
  (defn f-helper [a b]
    (+ (* x (square a))
       (* y b)
       (* a b)))
  (f-helper (+ 1 (* x y))
            (- 1 y)))

(defn lambda-f [x y]
  ((fn [a b]
      (+ (* x (square a))
       (* y b)
       (* a b)))
   (+ 1 (* x y))
   (- 1 y)))

(defn let-f [x y]
  (let [a (+ 1 (* x y))
        b (- 1 y)]
    (+ (* x (square a))
       (* y b)
       (* a b))))


