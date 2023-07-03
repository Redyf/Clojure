(defn aplica-desconto
  [valor-bruto]
  (println "Aplicando desconto em seu produto")
  (def desconto (* valor-bruto 0.9))
  (println "O desconto foi aplicado com sucesso!" desconto))
