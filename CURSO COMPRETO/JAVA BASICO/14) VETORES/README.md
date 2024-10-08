# VETORES
Em Java, um vetor, também conhecido como array, é uma estrutura de dados que permite armazenar um conjunto de elementos do mesmo tipo em uma única variável. Os vetores são usados para armazenar coleções de dados e facilitam a manipulação de múltiplos valores do mesmo tipo. Vou explicar como declarar, inicializar, acessar e manipular vetores em Java.

**Declaração de Vetor:**

Para declarar um vetor em Java, você precisa especificar o tipo de dado dos elementos que o vetor irá armazenar, seguido pelo nome do vetor e os colchetes `[]` para indicar que é um vetor. Aqui está um exemplo de declaração de um vetor de inteiros:

```java
int[] numeros;
```

Também é possível declarar e inicializar um vetor ao mesmo tempo:

```java
int[] numeros = new int[5]; // Vetor de inteiros com capacidade para 5 elementos
```

**Inicialização de Vetor:**

Após declarar um vetor, você pode inicializá-lo, o que envolve a alocação de memória e a definição do tamanho do vetor. Por exemplo, o código acima cria um vetor de inteiros com capacidade para 5 elementos. Todos os elementos do vetor são inicializados com o valor padrão para o tipo de dados, que é `0` para inteiros.

**Acesso a Elementos do Vetor:**

Você pode acessar elementos individuais do vetor usando seu índice, que começa em 0 para o primeiro elemento. Por exemplo:

```java
int primeiroElemento = numeros[0]; // Acessando o primeiro elemento
int segundoElemento = numeros[1]; // Acessando o segundo elemento
```

**Inicialização de Valores:**

Você pode inicializar valores em um vetor elemento por elemento:

```java
numeros[0] = 10;
numeros[1] = 20;
```

**Comprimento do Vetor:**

Para obter o comprimento de um vetor (ou seja, o número de elementos que ele contém), você pode usar a propriedade `length`:

```java
int tamanho = numeros.length; // Retorna o tamanho do vetor
```

**Iteração sobre um Vetor:**

Você pode usar um loop `for` ou o loop `for-each` para iterar sobre os elementos de um vetor:

Usando um loop `for`:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

Usando um loop `for-each`:

```java
for (int numero : numeros) {
    System.out.println(numero);
}
```

**Vetores Multidimensionais:**

Além de vetores unidimensionais, você pode criar vetores multidimensionais para armazenar dados em várias dimensões, como matrizes (array de arrays). Por exemplo, você pode criar uma matriz bidimensional assim:

```java
int[][] matriz = new int[3][3]; // Matriz 3x3
```

Isso cria uma matriz 3x3 de inteiros. Para acessar os elementos, você usa índices para a linha e a coluna.

Os vetores são uma parte fundamental da programação em Java e são usados extensivamente para armazenar e manipular dados. Eles podem ser usados para representar listas, tabelas, matrizes e muito mais.