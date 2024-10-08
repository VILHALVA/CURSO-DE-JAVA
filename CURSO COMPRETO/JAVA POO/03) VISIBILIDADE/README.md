# VISIBILIDADE
A visibilidade em Java se refere ao controle de acesso de classes, atributos e métodos em relação a outras classes no mesmo pacote ou em pacotes diferentes. Isso é importante para garantir a segurança, a encapsulação e a organização do código. Java fornece quatro níveis de visibilidade, controlados por modificadores de acesso. Vou explicar cada um deles:

1. **Public (`public`):**

   - O nível de visibilidade mais aberto.
   - Os membros (atributos e métodos) marcados como `public` são acessíveis de qualquer lugar, dentro ou fora da classe, em qualquer pacote.
   - É usado quando você deseja que um membro seja acessível por qualquer outra classe.

   Exemplo:

   ```java
   public class MinhaClasse {
       public int meuAtributo;
   
       public void meuMetodo() {
           // Código aqui
       }
   }
   ```

2. **Protected (`protected`):**

   - Os membros marcados como `protected` são acessíveis dentro da classe atual, em subclasses (mesmo que estejam em pacotes diferentes) e no próprio pacote.
   - É usado quando você deseja que um membro seja acessível principalmente por subclasses.

   Exemplo:

   ```java
   public class MinhaClasse {
       protected int meuAtributo;
   
       protected void meuMetodo() {
           // Código aqui
       }
   }
   ```

3. **Default (ausência de modificador):**

   - Também conhecido como "package-private" ou "amigável".
   - Os membros que não têm um modificador de acesso específico são acessíveis apenas dentro do mesmo pacote.
   - Não é possível acessar esses membros em pacotes diferentes.

   Exemplo:

   ```java
   class MinhaClasse {
       int meuAtributo; // Default (não há modificador)
   
       void meuMetodo() {
           // Código aqui
       }
   }
   ```

4. **Private (`private`):**

   - O nível de visibilidade mais restrito.
   - Os membros marcados como `private` são acessíveis apenas dentro da própria classe.
   - É usado quando você deseja encapsular completamente um membro, impedindo o acesso direto por outras classes.

   Exemplo:

   ```java
   public class MinhaClasse {
       private int meuAtributo;
   
       private void meuMetodo() {
           // Código aqui
       }
   }
   ```

É importante escolher o modificador de acesso apropriado com base nas necessidades do seu programa e nas regras de design. Use `public` quando você deseja que o membro seja acessível de qualquer lugar, `protected` para herança e acesso em subclasses, `default` para controle dentro do pacote e `private` para encapsulamento completo.

Além disso, a visibilidade ajuda a criar uma interface clara para outras partes do código, permitindo o acesso apenas ao que é necessário, enquanto oculta detalhes internos da implementação.
