# HERANÇA PARTE 2
Nesta segunda parte sobre herança em Java, vamos explorar conceitos avançados relacionados à herança, incluindo sobrescrita de métodos, modificadores de acesso e construtores nas subclasses, além de discutir as melhores práticas.

**Sobrescrita de Métodos:**

Sobrescrita de métodos é a capacidade de uma subclasse fornecer uma implementação específica para um método que já foi definido na superclasse. Isso permite que a subclasse modifique ou estenda o comportamento do método herdado. Para sobrescrever um método, siga estas regras:

- O método na subclasse deve ter o mesmo nome, tipo de retorno e parâmetros (ou uma assinatura compatível) que o método na superclasse.
- Use a anotação `@Override` (opcional, mas recomendada) para indicar explicitamente que você está sobrescrevendo um método.

Exemplo de sobrescrita de método:

```java
public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro late.");
    }
}
```

**Modificadores de Acesso:**

Os modificadores de acesso controlam a visibilidade dos membros (atributos e métodos) de uma classe em relação a outras classes. Ao herdar de uma superclasse, você pode ajustar os modificadores de acesso dos membros herdados da seguinte maneira:

- **public:** Os membros públicos da superclasse serão herdados como públicos na subclasse.
- **protected:** Os membros protegidos da superclasse serão herdados como protegidos na subclasse.
- **default (package-private):** Os membros sem um modificador de acesso específico (default/package-private) não podem ser acessados em pacotes diferentes, mas podem ser herdados por subclasses.
- **private:** Os membros privados da superclasse não podem ser herdados na subclasse.

**Construtores nas Subclasses:**

Quando você cria uma subclasse, é importante entender como os construtores funcionam. A subclasse pode chamar o construtor da superclasse usando a palavra-chave `super` no seu próprio construtor. Se você não fornecer um construtor na subclasse, o Java usará automaticamente o construtor padrão da superclasse.

Exemplo de construtor na subclasse:

```java
public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da superclasse
        this.raca = raca;
    }
}
```

**Chamando Métodos da Superclasse:**

Você pode chamar métodos da superclasse dentro da subclasse usando a palavra-chave `super`. Isso é útil quando você deseja acessar a implementação da superclasse antes de adicionar funcionalidade adicional na subclasse.

Exemplo:

```java
public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void fazerBarulho() {
        super.fazerBarulho(); // Chama o método da superclasse
        System.out.println("O cachorro late.");
    }
}
```

**Melhores Práticas:**

- Use herança quando houver uma relação de "é um" entre as classes (por exemplo, "Cachorro é um Animal").
- Evite herança múltipla, pois Java não suporta herança múltipla de classes, mas permite a implementação de várias interfaces.
- Use a sobrescrita de métodos com cuidado e mantenha a consistência com a assinatura dos métodos da superclasse.
- Evite expor membros (atributos e métodos) da superclasse como públicos, a menos que seja necessário.
- Considere usar composição em vez de herança sempre que possível para evitar acoplamento excessivo.

A herança é uma ferramenta poderosa na programação orientada a objetos, mas deve ser usada com cuidado para criar hierarquias de classes bem projetadas e de fácil manutenção. É importante entender os conceitos de herança, sobrescrita de métodos e modificadores de acesso ao projetar suas classes em Java.

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