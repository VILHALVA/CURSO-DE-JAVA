# METODOS
Métodos em Java são blocos de código reutilizáveis que executam uma tarefa específica. Eles são uma parte fundamental da programação orientada a objetos (POO) e são usados para dividir um programa em partes menores e mais gerenciáveis. Vou explicar os conceitos básicos de métodos em Java e como você pode criá-los, chamá-los e usá-los.

**Declaração de um Método:**

A declaração de um método em Java segue a seguinte sintaxe:

```java
tipoDeRetorno nomeDoMetodo(parâmetros) {
    // Corpo do método
    // Código a ser executado
    // Retorno de um valor (se necessário)
}
```

- `tipoDeRetorno`: Especifica o tipo de dado que o método retorna. Se o método não retornar nenhum valor, você usa `void`.
- `nomeDoMetodo`: É o nome do método.
- `parâmetros`: São variáveis que o método pode receber como entrada (opcionais).

**Exemplo de Método Simples:**

Aqui está um exemplo de um método simples que não recebe parâmetros e não retorna um valor (tipo de retorno `void`):

```java
public void saudacao() {
    System.out.println("Olá, mundo!");
}
```

**Chamando um Método:**

Para chamar um método, você precisa referenciar o nome do método seguido por parênteses. Se o método tiver parâmetros, você precisa fornecer os valores correspondentes dentro dos parênteses.

```java
nomeDoMetodo();
```

Exemplo de chamada do método `saudacao`:

```java
saudacao(); // Chama o método saudacao
```

**Métodos com Parâmetros:**

Métodos podem receber parâmetros, que são informações que você passa para o método para que ele possa realizar uma tarefa específica. Os parâmetros são especificados entre os parênteses na declaração do método.

```java
public int soma(int a, int b) {
    return a + b;
}
```

Este método `soma` recebe dois parâmetros inteiros `a` e `b` e retorna a soma deles.

**Chamando Métodos com Parâmetros:**

Ao chamar um método com parâmetros, você precisa fornecer os valores correspondentes para os parâmetros na mesma ordem em que foram declarados.

```java
int resultado = soma(5, 3); // Chama o método soma com os valores 5 e 3
```

**Valor de Retorno:**

Os métodos podem retornar um valor usando a palavra-chave `return`. O tipo de retorno do método deve corresponder ao tipo de dado declarado na assinatura do método. Se o método não retornar um valor, você usa `void`.

```java
public int soma(int a, int b) {
    return a + b; // Retorna a soma de a e b como um valor inteiro
}
```

**Métodos Estáticos:**

Métodos estáticos pertencem à classe, não a instâncias específicas da classe. Eles são chamados usando o nome da classe, não a instância.

```java
public static void metodoEstatico() {
    // Corpo do método
}
```

**Métodos de Instância:**

Métodos de instância pertencem a instâncias específicas de uma classe e são chamados em uma instância da classe.

```java
public void metodoDeInstancia() {
    // Corpo do método
}
```

Essas são as noções básicas sobre como criar, chamar e usar métodos em Java. Os métodos são uma parte crucial da POO e ajudam a organizar e reutilizar o código de maneira eficiente. Eles permitem dividir tarefas complexas em partes menores e mais gerenciáveis.