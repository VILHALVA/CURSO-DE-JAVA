# OBJETOS COMPOSTOS E AGREGACAO
Em programação orientada a objetos (POO), objetos compostos e agregação são conceitos que se referem à relação entre objetos, onde um objeto pode conter ou ser composto por outros objetos. Essas relações permitem criar estruturas complexas e modelar entidades do mundo real de maneira mais precisa. Vou explicar esses conceitos em detalhes:

**Objetos Compostos:**

Objetos compostos são objetos que contêm outros objetos como seus atributos. Eles são usados para representar entidades complexas que são formadas por várias partes. Um exemplo comum é um objeto `Carro` que é composto por objetos como o motor, os pneus, a carroceria, etc.

Exemplo:

```java
public class Carro {
    private Motor motor;
    private Pneu[] pneus;
    private Carroceria carroceria;

    // Construtor e métodos
}
```

Neste exemplo, a classe `Carro` é um objeto composto que contém outros objetos, como `Motor`, `Pneu` (um array de pneus) e `Carroceria`. Essa composição permite representar um carro como uma entidade complexa.

**Agregação:**

Agregação é um tipo específico de relação entre objetos onde um objeto (chamado de "todo") contém ou é composto por outros objetos (chamados de "partes"). No entanto, as partes podem existir independentemente do objeto todo. A agregação é uma relação de "tem um" ou "é parte de".

Exemplo:

```java
public class Casa {
    private Quarto[] quartos;
    private Cozinha cozinha;

    // Construtor e métodos
}
```

Neste exemplo, a classe `Casa` é o objeto todo que é composto por outros objetos, como `Quarto` (um array de quartos) e `Cozinha`. No entanto, os quartos e a cozinha podem existir independentemente da casa. Você pode criar quartos separadamente e, posteriormente, agregá-los a uma casa.

**Diferença entre Composição e Agregação:**

A principal diferença entre composição e agregação está na vida útil das partes em relação ao objeto todo:

- Composição: As partes são criadas e gerenciadas pelo objeto todo. Se o objeto todo for destruído, suas partes também serão.
- Agregação: As partes podem existir independentemente do objeto todo. Se o objeto todo for destruído, suas partes ainda podem existir.

Ambas as relações são importantes e são usadas para modelar diferentes tipos de relacionamentos entre objetos em um sistema. A escolha entre composição e agregação depende da natureza do relacionamento que você deseja modelar. É importante entender esses conceitos ao projetar classes em POO para representar relacionamentos de maneira precisa e eficaz.
