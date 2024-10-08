# HERANÇA PARTE 1
A herança é um dos princípios fundamentais da Programação Orientada a Objetos (POO) que permite criar novas classes (subclasses) com base em classes existentes (superclasses). Isso permite a reutilização de código e a criação de hierarquias de classes. Nesta primeira parte sobre herança, vou explicar os conceitos básicos e como criar e estender classes em Java.

**Conceitos Básicos de Herança:**

1. **Superclasse (Classe Pai):** A classe que é estendida para criar uma nova classe é chamada de superclasse ou classe pai. Ela contém os atributos e métodos comuns às subclasses.

2. **Subclasse (Classe Filha):** A classe que estende uma superclasse é chamada de subclasse ou classe filha. Ela herda os atributos e métodos da superclasse e pode adicionar ou sobrescrever esses membros.

3. **Herança:** A herança é a relação entre a superclasse e a subclasse. A subclasse herda características (atributos e métodos) da superclasse.

**Como Criar e Estender Classes em Java:**

Vamos criar um exemplo simples para entender como criar e estender classes em Java.

**Superclasse (Classe Pai):**

```java
public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerBarulho() {
        System.out.println("O animal faz barulho.");
    }

    public void comer() {
        System.out.println("O animal está comendo.");
    }
}
```

Neste exemplo, a classe `Animal` é a superclasse. Ela possui dois atributos (nome e idade) e dois métodos (fazerBarulho e comer).

**Subclasse (Classe Filha):**

```java
public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void fazerBarulho() {
        System.out.println("O cachorro late.");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}
```

Neste exemplo, a classe `Cachorro` é uma subclasse da classe `Animal`. Ela herda os atributos e métodos da classe `Animal` e também adiciona um novo método chamado `abanarRabo`.

**Utilizando as Classes:**

Aqui está como você pode usar as classes em Java:

```java
public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", 3);
        
        meuCachorro.fazerBarulho(); // Saída: O cachorro late.
        meuCachorro.comer(); // Saída: O animal está comendo.
        meuCachorro.abanarRabo(); // Saída: O cachorro está abanando o rabo.
    }
}
```

Observe que, ao criar uma instância de `Cachorro`, também é possível acessar os métodos herdados da classe `Animal`, como `comer`. Isso demonstra o princípio da herança, onde uma subclasse pode herdar características de uma superclasse e adicionar funcionalidade adicional.

Na segunda parte sobre herança, exploraremos conceitos como sobrescrita de métodos, modificadores de acesso e construtores nas subclasses, além de discutir as melhores práticas relacionadas à herança em Java.
