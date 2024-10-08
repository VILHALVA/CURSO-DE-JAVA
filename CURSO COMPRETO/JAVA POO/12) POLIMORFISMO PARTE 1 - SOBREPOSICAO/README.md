# POLIMORFISMO PARTE 1 - SOBREPOSICAO
O polimorfismo é um dos princípios fundamentais da Programação Orientada a Objetos (POO) em Java e se refere à capacidade de um objeto se comportar de várias maneiras diferentes com base em seu tipo ou na implementação específica de seus métodos. Uma das formas mais comuns de polimorfismo em Java é a sobreposição (ou substituição) de métodos, que ocorre quando uma subclasse fornece uma implementação específica para um método que já foi definido em sua superclasse.

**Conceito de Sobreposição de Métodos:**

A sobreposição ocorre quando uma subclasse fornece uma implementação específica para um método que já foi definido em sua superclasse. Isso permite que a subclasse substitua o comportamento padrão do método da superclasse pelo seu próprio comportamento.

**Regras para Sobreposição:**

Para realizar uma sobreposição bem-sucedida, você deve seguir as seguintes regras:

1. O método na subclasse deve ter o mesmo nome, tipo de retorno e parâmetros (ou uma assinatura compatível) que o método na superclasse.

2. Use a anotação `@Override` (opcional, mas recomendada) para indicar explicitamente que você está sobrescrevendo um método.

3. A visibilidade do método na subclasse não pode ser mais restrita do que a visibilidade do método na superclasse. Por exemplo, se o método na superclasse for `protected`, ele não pode ser sobrescrito como `private` na subclasse.

4. A subclasse não pode lançar exceções (checked) que não são lançadas pelo método da superclasse. No entanto, a subclasse pode lançar exceções mais específicas ou subtipos das exceções lançadas pelo método da superclasse.

**Exemplo de Sobreposição:**

Vamos criar um exemplo simples de sobreposição de método em Java. Primeiro, criaremos uma classe `Animal` com um método chamado `emitirSom`, e depois criaremos uma subclasse `Cachorro` que sobrepõe esse método.

```java
public class Animal {
    public void emitirSom() {
        System.out.println("O animal emite um som genérico.");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late.");
    }
}
```

Aqui, a subclasse `Cachorro` substitui o comportamento do método `emitirSom` definido na superclasse `Animal`. Quando chamamos `emitirSom` em um objeto `Cachorro`, ele executará a implementação específica da subclasse.

**Usando o Polimorfismo:**

Uma das principais vantagens da sobreposição é que você pode tratar objetos da subclasse como objetos da superclasse, permitindo que você use polimorfismo. Por exemplo:

```java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.emitirSom(); // Chama o método da subclasse Cachorro
    }
}
```

Neste exemplo, um objeto da subclasse `Cachorro` é atribuído a uma variável do tipo superclasse `Animal`, e, em seguida, o método `emitirSom` é chamado. Isso demonstra o polimorfismo, pois o método da subclasse é executado, mesmo que a variável seja declarada como uma instância da superclasse.

A sobreposição de métodos é uma técnica poderosa que permite criar classes mais flexíveis e extensíveis em Java, tornando o código mais fácil de entender e manter. Ela desempenha um papel fundamental na implementação de polimorfismo e permite que objetos se comportem de maneiras diferentes, dependendo de sua classe real.