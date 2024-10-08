# CRIANDO CLASSES E OBJETOS
Para criar classes e objetos em Java, você precisa seguir algumas etapas básicas. Vou guiar você através do processo de criação de uma classe simples e da criação de objetos a partir dessa classe. Vamos criar uma classe `Carro` como exemplo.

**Passo 1: Definir a Classe**

Aqui está como você define uma classe em Java:

```java
public class Carro {
    // Atributos
    String modelo;
    String cor;
    int ano;

    // Métodos
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
```

Neste exemplo, criamos uma classe `Carro` com três atributos (modelo, cor, ano) e três métodos (ligar, desligar, acelerar).

**Passo 2: Criar Objetos a partir da Classe**

Para criar objetos (instâncias) da classe `Carro`, você precisa fazer o seguinte:

```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro meuCarro = new Carro();
        Carro outroCarro = new Carro();
        
        // Acessando atributos e chamando métodos
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Vermelho";
        meuCarro.ano = 1970;

        outroCarro.modelo = "Gol";
        outroCarro.cor = "Azul";
        outroCarro.ano = 2020;

        meuCarro.ligar();
        meuCarro.acelerar();

        outroCarro.ligar();
        outroCarro.desligar();
    }
}
```

Neste exemplo, criamos dois objetos, `meuCarro` e `outroCarro`, a partir da classe `Carro`. Em seguida, atribuímos valores aos atributos desses objetos e chamamos métodos relacionados a eles.

**Passo 3: Executar o Programa**

Para executar o programa, você pode compilar o arquivo `.java` que contém as classes e depois executar o programa resultante. O resultado no console será:

```
O carro está ligado.
O carro está acelerando.
O carro está ligado.
O carro está desligado.
```

Essa é uma introdução simples à criação de classes e objetos em Java. À medida que você se aprofunda na POO, pode explorar conceitos adicionais, como encapsulamento, herança, polimorfismo e muito mais, para criar programas mais complexos e flexíveis.