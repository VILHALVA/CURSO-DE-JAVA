# ESTRUTURA DE REPETICAO PARTE 2
Continuando com as estruturas de repetição em Java, vou abordar as estruturas de repetição aninhadas (loops dentro de loops) e mostrar como usar o comando `break` para sair de um loop ou um loop aninhado.

4. **Loops Aninhados**:

   Você pode colocar loops dentro de outros loops, o que é útil quando você precisa iterar em várias dimensões, como em matrizes bidimensionais ou quando deseja gerar combinações de valores.

   Exemplo de um loop `for` aninhado que imprime uma matriz bidimensional:

   ```java
   int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
   
   for (int i = 0; i < matriz.length; i++) {
       for (int j = 0; j < matriz[i].length; j++) {
           System.out.print(matriz[i][j] + " ");
       }
       System.out.println(); // Para mover para a próxima linha após cada linha da matriz
   }
   ```

   Este exemplo imprime uma matriz 3x3.

5. **Comando `break`**:

   O comando `break` é usado para sair de um loop antes de atingir sua condição de continuação. Pode ser usado em qualquer loop (for, while ou do-while) e também em loops aninhados.

   Exemplo de uso do `break` em um loop `while`:

   ```java
   int i = 1;
   while (true) {
       System.out.println(i);
       i++;
       if (i > 5) {
           break; // Sai do loop quando i for maior que 5
       }
   }
   ```

   O `break` é útil quando você deseja sair de um loop com base em uma condição, economizando tempo de processamento.

6. **Comando `continue`**:

   O comando `continue` é usado para pular a iteração atual de um loop e continuar com a próxima iteração. Ele é útil quando você deseja ignorar certos valores ou condições durante a execução do loop.

   Exemplo de uso do `continue` em um loop `for`:

   ```java
   for (int i = 1; i <= 5; i++) {
       if (i == 3) {
           continue; // Pula a iteração quando i for igual a 3
       }
       System.out.println(i);
   }
   ```

   Neste exemplo, o número 3 é pulado e não é impresso na saída.

7. **Rótulos (Labels)**:

   Java permite rotular loops para controlar loops aninhados e usar o comando `break` ou `continue` em um loop específico. No entanto, o uso de rótulos é geralmente desencorajado, pois pode tornar o código mais complexo e menos legível.

   Exemplo de rótulo e `break`:

   ```java
   outerLoop: for (int i = 1; i <= 3; i++) {
       innerLoop: for (int j = 1; j <= 3; j++) {
           if (i == 2 && j == 2) {
               break outerLoop; // Sai do loop externo quando i e j forem 2
           }
           System.out.println("i=" + i + ", j=" + j);
       }
   }
   ```

   O rótulo `outerLoop` é usado para controlar o `break` no loop externo.

Essas são algumas das técnicas avançadas relacionadas a estruturas de repetição em Java. Lembre-se de que o uso de `break` e `continue` deve ser feito com cuidado para evitar loops infinitos ou código difícil de entender. Escolha a abordagem que melhor atenda às necessidades do seu programa.