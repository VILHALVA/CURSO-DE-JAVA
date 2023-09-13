# RESUMO DAS AULAS SOBRE HERANÇA:
* **Herança:** Permite basear uma nova classe na definição de uma outra classe previamente existente. Será aplicada tanto para as características quanto para os comportamentos.

* **Raiz:** uma classe que não possui superclasses (mãe).

* **Folha:** uma classe que não possui subclasses (filhas).

* **Descendente:** A teve um filho AC e AC teve um filho ACA. A é ancestral de ACA. 
A NÃO É ANCESTRAL DE AC

* **Ascendente:** ACA é descendente de A.
AC NÃO É DESCENDENTE DE A

* **Especialização:** percorrer a árvore de cima pra baixo.

* **Generalização:** percorrer a árvore de baixo pra cima.

* **HERANÇA DE IMPLEMENTAÇÃO (HERANÇA POBRE):**
Apenas herda os atributos e os métodos da classe mãe, sem implementar mais nenhum.

* **HERANÇA PARA DIFERENÇA:**
Herda os atributos e os métodos da classe mãe, implementando outros métodos dela própria.

* **Classe abstrata:** não pode ser instanciada. Só pode servir como progenitora. (Não pode gerar objetos)

* **Método abstrato:** declarado, mas não implementado na progenitora. (Interfaces)
* **Classe final:** não pode ser herdada por outra classe. É obrigatoriamente folha. (Não pode ter filhos)
* **Método final:** não pode ser sobrescrito pelas suas sub-classes. É obrigatoriamente herdado. (Não pode gerar uma especialização).

* **Sobrepor:** fazer a mesma coisa de formas diferentes.

## "public final void pagarMensalidade()" > ATRAVÉS DO "FINAL":
1) QUANDO USADO NO METODO: O MESMO NÃO PODE SER SOBREPOSTO / ENCAPSULAMENTO TOTAL (@Override).
2) QUANDO USADO NA CLASS: ELA NÃO PODE GERAR FILHAS / INVALIDANDO A HERANÇA (@Override).

😀Esse negócio de subclasse (Filha) não herdar todas as características da superclasse (Mãe): Que podem ser decididas via "public" e "private" me lembra do que ando estudando em herança fenótipa em genética: "public (ou @Override)" seria o gene dominante e "private (ou "final") seria o gene recessivo. [A LÓGICA É A MESMA].