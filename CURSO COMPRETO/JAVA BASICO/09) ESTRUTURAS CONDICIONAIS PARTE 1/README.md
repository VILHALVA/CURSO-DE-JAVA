# ESTRUTURAS CONDICIONAIS PARTE 1
As estruturas condicionais em Java permitem que você controle o fluxo do seu programa com base em condições. Elas permitem que você execute blocos de código se uma condição for verdadeira e, opcionalmente, execute um bloco alternativo se a condição for falsa. Vou explicar as estruturas condicionais básicas em Java: `if`, `else if` e `else`.

1. **Estrutura `if`**:

   A estrutura `if` é usada para executar um bloco de código se uma condição for verdadeira. Se a condição não for verdadeira, o bloco de código não será executado.

   ```java
   if (condicao) {
       // Código a ser executado se a condição for verdadeira
   }
   ```

   Exemplo:

   ```java
   int idade = 18;
   if (idade >= 18) {
       System.out.println("Você é maior de idade.");
   }
   ```

2. **Estrutura `else if`**:

   A estrutura `else if` é usada para testar várias condições em sequência. Se a primeira condição for falsa, ele verifica a próxima condição e assim por diante. O bloco de código associado à primeira condição verdadeira será executado.

   ```java
   if (condicao1) {
       // Código a ser executado se condicao1 for verdadeira
   } else if (condicao2) {
       // Código a ser executado se condicao2 for verdadeira
   } else {
       // Código a ser executado se nenhuma das condições anteriores for verdadeira
   }
   ```

   Exemplo:

   ```java
   int idade = 16;
   if (idade >= 18) {
       System.out.println("Você é maior de idade.");
   } else if (idade >= 13) {
       System.out.println("Você é um adolescente.");
   } else {
       System.out.println("Você é uma criança.");
   }
   ```

3. **Estrutura `else`**:

   A estrutura `else` é usada para especificar um bloco de código que será executado se a condição do `if` for falsa.

   ```java
   if (condicao) {
       // Código a ser executado se a condição for verdadeira
   } else {
       // Código a ser executado se a condição for falsa
   }
   ```

   Exemplo:

   ```java
   int idade = 15;
   if (idade >= 18) {
       System.out.println("Você é maior de idade.");
   } else {
       System.out.println("Você é menor de idade.");
   }
   ```

4. **Operador ternário (`? :`)**:

   O operador ternário é uma forma concisa de criar estruturas condicionais em uma única linha. Ele permite que você atribua um valor a uma variável com base em uma condição.

   ```java
   variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso;
   ```

   Exemplo:

   ```java
   int idade = 20;
   String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
   System.out.println(status); // Isso imprimirá "Maior de idade"
   ```

Essas são as estruturas condicionais básicas em Java. Elas permitem que você tome decisões em seu programa com base em condições e controlam o fluxo de execução do código. Combine essas estruturas com operadores de comparação (como `<`, `>`, `==`, `!=`, etc.) para criar condições complexas.