# OPERADORES ARITMETICOS

<img src="./IMAGENS/OPERADORES DE ATRIBUIÇÃO.png" align="center" width="400"> <br>
<img src="./IMAGENS/OPERADORES SYSTEMS.png" align="center" width="400"> <br>
<img src="./IMAGENS/OPERADORES TABELA.png" align="center" width="400"> <br>
<img src="./IMAGENS/OPERADORES UNÁRIOS.jpg" align="center" width="400"> <br>
<img src="./IMAGENS/ORDEM DE DESCENDENCIA E PRESCENDENCIA.jpg" align="center" width="400"> <br>
<img src="./IMAGENS/MATH CLASS JAVA.jpg" align="center" width="400"> <br>
<img src="./IMAGENS/METODO FLOOR.jpg" align="center" width="400"> <br>
<img src="./IMAGENS/METODOS DA CLASSE MATH 2.jpg" align="center" width="400"> <br>
<img src="./IMAGENS/METODOS DA CLASSE MATH.jpg" align="center" width="400"> <br>
<img src="./IMAGENS/RANDOM CLASS.png" align="center" width="400"> <br>
<img src="./IMAGENS/RANDOM GENERATION.png" align="center" width="400"> <br>
<img src="./IMAGENS/RANDOM NUMBER.png" align="center" width="400"> <br>

Os operadores aritméticos em Java são utilizados para realizar operações matemáticas básicas em valores numéricos. Eles permitem que você realize adições, subtrações, multiplicações, divisões e outras operações matemáticas. Vou explicar cada um dos operadores aritméticos em Java e dar exemplos de como usá-los:

1. **Adição (+)**: O operador de adição é usado para somar dois valores.

   Exemplo:
   ```java
   int soma = 5 + 3; // soma é igual a 8
   ```

2. **Subtração (-)**: O operador de subtração é usado para subtrair um valor de outro.

   Exemplo:
   ```java
   int diferenca = 10 - 4; // diferenca é igual a 6
   ```

3. **Multiplicação (*)**: O operador de multiplicação é usado para multiplicar dois valores.

   Exemplo:
   ```java
   int produto = 6 * 7; // produto é igual a 42
   ```

4. **Divisão (/)**: O operador de divisão é usado para dividir um valor pelo outro. Observe que a divisão de inteiros resulta em um valor inteiro, truncando o resultado se necessário. Para obter um resultado decimal, pelo menos um dos operandos deve ser do tipo de ponto flutuante (float ou double).

   Exemplo de divisão inteira:
   ```java
   int quociente = 10 / 3; // quociente é igual a 3 (a parte decimal é truncada)
   ```

   Exemplo de divisão com ponto flutuante:
   ```java
   double resultado = 10.0 / 3; // resultado é igual a 3.33333...
   ```

5. **Módulo (%)**: O operador de módulo retorna o resto da divisão de um valor pelo outro. É útil para verificar se um número é divisível por outro.

   Exemplo:
   ```java
   int resto = 10 % 3; // resto é igual a 1 (10 dividido por 3 tem resto 1)
   ```

6. **Incremento (++) e Decremento (--)**: Os operadores de incremento e decremento são usados para aumentar ou diminuir o valor de uma variável em 1.

   Exemplo de incremento:
   ```java
   int numero = 5;
   numero++; // Agora, numero é igual a 6
   ```

   Exemplo de decremento:
   ```java
   int numero = 8;
   numero--; // Agora, numero é igual a 7
   ```

Esses são os operadores aritméticos básicos em Java. Eles são amplamente utilizados em cálculos matemáticos e são fundamentais para muitos programas Java. Lembre-se de que a ordem de precedência dos operadores é importante, e você pode usar parênteses para controlar a ordem de avaliação em expressões mais complexas.