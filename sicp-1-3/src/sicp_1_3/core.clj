(ns sicp-1-3.core
  (:require [sicp-1-3.part-1 :refer :all]))

;; 1.3.1

(sum-integers 1 10)

(cube 3)

(sum-cubes 1 10)

(* 8 (pi-sum 1 1000))

(new-sum-cubes 1 10)

(new-sum-integers 1 10)

(* 8 (new-pi-sum 1 1000))

(integral cube 0 1 0.01)

(integral cube 0 1 0.001)
