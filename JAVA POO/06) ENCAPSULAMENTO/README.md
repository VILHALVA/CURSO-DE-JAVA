# ENCAPSULAMENTO
O encapsulamento é um dos princípios fundamentais da Programação Orientada a Objetos (POO) em Java. Ele se refere à prática de esconder os detalhes de implementação internos de uma classe e fornecer uma interface pública bem definida para interagir com a classe. O encapsulamento é alcançado usando modificadores de acesso, como `private`, `public`, `protected`, e métodos getters e setters. Vou explicar a importância do encapsulamento e como implementá-lo em Java:

**Importância do Encapsulamento:**

1. **Segurança:** O encapsulamento ajuda a proteger os dados de uma classe, impedindo que eles sejam modificados inadvertidamente por partes externas do código. Isso garante que os dados permaneçam consistentes.

2. **Abstração:** O encapsulamento permite que você crie uma abstração de uma classe, apresentando apenas os detalhes necessários para os usuários da classe, ocultando a complexidade interna.

3. **Manutenção:** Ao encapsular os detalhes de implementação, você pode alterar o funcionamento interno de uma classe sem afetar o código que a utiliza. Isso facilita a manutenção e evita quebras em código existente.

**Como Implementar o Encapsulamento em Java:**

1. **Usar Modificadores de Acesso:**

   - `private`: Torna o membro (atributo ou método) acessível somente dentro da própria classe.
   - `public`: Torna o membro acessível de qualquer lugar.
   - `protected`: Torna o membro acessível dentro da própria classe, subclasses e do mesmo pacote.
   - (Default/package-private): Torna o membro acessível somente dentro do mesmo pacote.

   Por padrão, é recomendável declarar os atributos como `private` e fornecer métodos getters e setters públicos para acessá-los e modificá-los.

2. **Métodos Getters e Setters:**

   - Use métodos getters para recuperar o valor de um atributo privado.
   - Use métodos setters para definir o valor de um atributo privado.
   - Isso permite que você controle o acesso e validação dos atributos.

   Exemplo:

   ```java
   public class Pessoa {
       private String nome;
   
       public String getNome() {
           return nome;
       }
   
       public void setNome(String nome) {
           if (nome != null && !nome.isEmpty()) {
               this.nome = nome;
           }
       }
   }
   ```

3. **Documentação:** Forneça documentação clara para a interface pública da classe, explicando como usar os métodos e quais valores são esperados.

4. **Uso de Final e Imutabilidade:** Você pode tornar uma classe imutável, garantindo que seus atributos não possam ser modificados após a criação. Para isso, marque os atributos como `final` e não forneça métodos setters.

Exemplo de classe imutável:

```java
public final class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
```

O encapsulamento é essencial para criar código robusto, seguro e de fácil manutenção em Java. Ele ajuda a garantir que o estado interno de uma classe seja consistente e protegido contra acesso não autorizado, ao mesmo tempo em que fornece uma interface pública clara para os usuários da classe. Portanto, é uma prática fundamental na programação orientada a objetos. 
