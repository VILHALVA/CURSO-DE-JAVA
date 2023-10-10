# ESTRUTURA DE REPETICAO PARTE 1
As estruturas de repetição em Java permitem que você execute um bloco de código repetidamente com base em uma condição ou um número específico de iterações. Existem dois tipos principais de estruturas de repetição em Java: o loop `for` e o loop `while`. Vou explicar cada um deles e fornecer exemplos de como usá-los.

1. **Loop `for`**:

   O loop `for` é geralmente usado quando você sabe exatamente quantas vezes deseja executar um bloco de código. Ele é composto por três partes: a inicialização, a condição de continuação e a atualização.

   ```java
   for (inicialização; condição; atualização) {
       // Código a ser repetido
   }
   ```

   - Inicialização: É onde você define e inicializa a variável de controle. Isso é executado apenas uma vez no início do loop.
   - Condição: É uma expressão booleana que determina se o loop deve continuar executando. Se for verdadeira, o loop continuará; caso contrário, ele será encerrado.
   - Atualização: É onde você atualiza a variável de controle após cada iteração do loop.

   Exemplo de um loop `for` simples que imprime os números de 1 a 5:

   ```java
   for (int i = 1; i <= 5; i++) {
       System.out.println(i);
   }
   ```

2. **Loop `while`**:

   O loop `while` é usado quando você não sabe antecipadamente quantas vezes deseja executar um bloco de código, mas deseja continuar enquanto uma condição for verdadeira.

   ```java
   while (condição) {
       // Código a ser repetido
   }
   ```

   Exemplo de um loop `while` que imprime os números de 1 a 5:

   ```java
   int i = 1;
   while (i <= 5) {
       System.out.println(i);
       i++;
   }
   ```

   Neste exemplo, o loop continuará até que a variável `i` seja maior que 5.

3. **Loop `do-while`**:

   O loop `do-while` é semelhante ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, mesmo se a condição for falsa desde o início.

   ```java
   do {
       // Código a ser repetido
   } while (condição);
   ```

   Exemplo de um loop `do-while` que solicita entrada do usuário até que um número positivo seja fornecido:

   ```java
   Scanner scanner = new Scanner(System.in);
   int numero;
   
   do {
       System.out.println("Digite um número positivo: ");
       numero = scanner.nextInt();
   } while (numero <= 0);
   
   System.out.println("Você digitou um número positivo: " + numero);
   ```

   Neste exemplo, o código dentro do loop é executado pelo menos uma vez, mesmo que o usuário forneça um número negativo na primeira tentativa.

Essas são as estruturas de repetição básicas em Java. Elas são fundamentais para automatizar tarefas repetitivas e controlar o fluxo de execução do seu programa com base em condições. Escolha a estrutura de repetição adequada com base nos requisitos específicos do seu programa.