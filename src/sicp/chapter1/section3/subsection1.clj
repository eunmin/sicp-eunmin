(ns sicp.chapter1.section3.subsection1
  (:refer-clojure :exclude [next inc identity]))

;; 1.3.1

(defn cube [x]
  (* x x x))

(defn sum-integers [a b]
  (if (> a b)
    0
    (+ a (sum-integers (+ a 1) b))))

(defn sum-cubes [a b]
  (if (> a b)
    0
    (+ (cube a) (sum-cubes (+ a 1) b))))

(defn pi-sum [a b]
  (if (> a b)
    0
    (+ (/ 1.0 (* a (+ a 2))) (pi-sum (+ a 4) b))))

(defn sum [term a next b]
  (if (> a b)
    0
    (+ (term a) (sum term (next a) next b))))

(defn inc [x]
  (+ x 1))

(defn new-sum-cubes [a b]
  (sum cube a inc b))

(defn identity [x]
  x)

(defn new-sum-integers [a b]
  (sum identity a inc b))

(defn new-pi-sum [a b]
  (defn pi-term [x]
    (/ 1.0 (* x (+ x 2))))
  (defn pi-next [x]
    (+ x 4))
  (sum pi-term a pi-next b))

(defn integral [f a b dx]
  (defn add-dx [x]
    (+ x dx))
  (* (sum f (+ a (/ dx 2.0)) add-dx b) dx))

(sum-integers 1 10)

(cube 3)

(sum-cubes 1 10)

(* 8 (pi-sum 1 1000))

(new-sum-cubes 1 10)

(new-sum-integers 1 10)

(* 8 (new-pi-sum 1 1000))

(integral cube 0 1 0.01)

(integral cube 0 1 0.001)
