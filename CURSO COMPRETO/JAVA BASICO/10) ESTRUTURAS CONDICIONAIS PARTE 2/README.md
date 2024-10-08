# ESTRUTURAS CONDICIONAIS PARTE 2
Continuando com as estruturas condicionais em Java, agora vou abordar estruturas mais avançadas, como a instrução `switch` e como lidar com múltiplas condições.

5. **Instrução `switch`**:

   A instrução `switch` é usada para verificar uma expressão em relação a várias opções e executar código com base na opção correspondente. É uma alternativa mais limpa e eficiente do que usar várias declarações `if-else` quando você precisa comparar uma única variável com várias possibilidades.

   ```java
   switch (expressao) {
       case valor1:
           // Código a ser executado se a expressao for igual a valor1
           break;
       case valor2:
           // Código a ser executado se a expressao for igual a valor2
           break;
       // ... mais casos
       default:
           // Código a ser executado se nenhum caso corresponder
   }
   ```

   Exemplo:

   ```java
   int diaSemana = 2;
   String mensagem;

   switch (diaSemana) {
       case 1:
           mensagem = "Domingo";
           break;
       case 2:
           mensagem = "Segunda-feira";
           break;
       case 3:
           mensagem = "Terça-feira";
           break;
       // ... outros casos
       default:
           mensagem = "Dia inválido";
   }

   System.out.println("Hoje é " + mensagem);
   ```

   É importante notar que você deve usar a instrução `break` após cada caso para sair do `switch` após a execução do caso correspondente.

6. **Operadores Lógicos para Múltiplas Condições**:

   Às vezes, você precisa lidar com condições que envolvem mais de uma expressão. Para isso, você pode usar operadores lógicos para combinar várias condições.

   - **Operador `&&` (E Lógico)**: Usado para verificar se todas as condições são verdadeiras.

     Exemplo:
     ```java
     int idade = 25;
     boolean possuiCarteira = true;
     if (idade >= 18 && possuiCarteira) {
         System.out.println("Você pode dirigir.");
     }
     ```

   - **Operador `||` (OU Lógico)**: Usado para verificar se pelo menos uma das condições é verdadeira.

     Exemplo:
     ```java
     boolean eDiaUtil = true;
     boolean eFeriado = false;
     if (eDiaUtil || eFeriado) {
         System.out.println("Você pode relaxar.");
     }
     ```

   - **Operador `!` (NÃO Lógico)**: Usado para inverter o valor de uma condição.

     Exemplo:
     ```java
     boolean estaChovendo = false;
     if (!estaChovendo) {
         System.out.println("Vamos fazer um piquenique.");
     }
     ```

Essas são algumas das estruturas condicionais mais avançadas em Java que você pode usar para controlar o fluxo do seu programa com base em múltiplas condições ou verificar uma variável em relação a várias opções. Escolha a estrutura que melhor atenda às necessidades do seu programa.