# TIPOS PRIMIVOS
Os tipos primitivos em Java representam valores simples, como números inteiros, números de ponto flutuante e caracteres. Eles são chamados de "primitivos" porque não são objetos; em vez disso, eles são armazenados diretamente na memória e têm um tamanho fixo. Java possui oito tipos primitivos, que podem ser divididos em quatro categorias: inteiros, números de ponto flutuante, caracteres e booleanos. Vamos explorar cada uma delas:

1. **Tipos Inteiros:**

   - `byte`: Armazena valores inteiros de 8 bits. Intervalo: de -128 a 127.
   - `short`: Armazena valores inteiros de 16 bits. Intervalo: de -32,768 a 32,767.
   - `int`: Armazena valores inteiros de 32 bits. Intervalo: de -2^31 a 2^31-1.
   - `long`: Armazena valores inteiros de 64 bits. Intervalo: de -2^63 a 2^63-1.

   Exemplo de declaração e inicialização de variáveis inteiras:

   ```java
   int idade = 30;
   long populacaoMundial = 7_900_000_000L;  // Note o sufixo "L" para indicar um valor longo.
   ```

2. **Tipos de Ponto Flutuante:**

   - `float`: Armazena números de ponto flutuante de 32 bits, com precisão limitada.
   - `double`: Armazena números de ponto flutuante de 64 bits, com maior precisão.

   Exemplo de declaração e inicialização de variáveis de ponto flutuante:

   ```java
   float salarioMensal = 2500.50f;  // Note o sufixo "f" para indicar um valor float.
   double altura = 1.85;
   ```

3. **Tipo Caractere:**

   - `char`: Armazena um único caractere Unicode de 16 bits.

   Exemplo de declaração e inicialização de variável de caractere:

   ```java
   char letra = 'A';
   ```

4. **Tipo Booleano:**

   - `boolean`: Armazena valores verdadeiro (`true`) ou falso (`false`).

   Exemplo de declaração e inicialização de variável booleana:

   ```java
   boolean estaChovendo = false;
   ```

Esses tipos primitivos são usados para armazenar dados simples e são eficientes em termos de uso de memória e desempenho. Eles são amplamente utilizados na programação Java para representar valores básicos. Além desses tipos primitivos, Java também suporta tipos de referência, que são baseados em classes e objetos, mas os tipos primitivos são essenciais para muitos aspectos da programação em Java.