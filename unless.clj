(defn unless [cond then else]
  (if cond else then))

(defmacro unless [cond then else]
  (if cond else then))

(defmacro unless [cond then else]
  '(if cond else then))

(defmacro unless [cond then else]
  (list 'if cond else then))

(defmacro unless [cond then else]
  `(if ~cond ~else ~then))
