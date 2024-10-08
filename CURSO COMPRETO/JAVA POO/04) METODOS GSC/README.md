# METODOS GETTERS SETTERS E CONSTRUTOR
Em Java, os métodos getters, setters e construtores são elementos fundamentais da Programação Orientada a Objetos (POO) que permitem controlar o acesso a atributos de uma classe e inicializar objetos. Vou explicar cada um deles em detalhes:

1. **Métodos Getters:**

   Os métodos getters são usados para obter o valor de um atributo privado de uma classe. Eles são chamados para acessar os valores dos atributos encapsulados. Por convenção, os nomes dos métodos getters começam com "get" seguido do nome do atributo.

   Exemplo de um método getter:

   ```java
   public class Pessoa {
       private String nome;
   
       // Método getter para o atributo 'nome'
       public String getNome() {
           return nome;
       }
   }
   ```

   Você pode usar o método getter para acessar o valor do atributo `nome` de um objeto da classe `Pessoa`.

2. **Métodos Setters:**

   Os métodos setters são usados para definir ou modificar o valor de um atributo privado de uma classe. Eles são chamados para alterar os valores dos atributos encapsulados. Por convenção, os nomes dos métodos setters começam com "set" seguido do nome do atributo.

   Exemplo de um método setter:

   ```java
   public class Pessoa {
       private String nome;
   
       // Método setter para o atributo 'nome'
       public void setNome(String novoNome) {
           nome = novoNome;
       }
   }
   ```

   Você pode usar o método setter para definir o valor do atributo `nome` de um objeto da classe `Pessoa`.

3. **Construtores:**

   Os construtores são métodos especiais usados para inicializar objetos de uma classe quando são criados. Eles têm o mesmo nome da classe e não possuem tipo de retorno. Os construtores são chamados automaticamente quando você cria um novo objeto usando o operador `new`.

   Exemplo de um construtor:

   ```java
   public class Pessoa {
       private String nome;
   
       // Construtor da classe Pessoa
       public Pessoa(String nome) {
           this.nome = nome;
       }
   }
   ```

   Você pode usar o construtor para criar um objeto `Pessoa` com um nome especificado:

   ```java
   Pessoa pessoa1 = new Pessoa("Alice");
   Pessoa pessoa2 = new Pessoa("Bob");
   ```

   Note que a palavra-chave `this` é usada para se referir ao atributo `nome` da classe, evitando conflitos entre o parâmetro `nome` do construtor e o atributo `nome` da classe.

   **Construtores Padrão:** Se você não fornecer nenhum construtor em sua classe, o Java criará automaticamente um construtor padrão sem argumentos que inicializa os atributos com valores padrão (por exemplo, `null` para strings).

   **Sobrecarga de Construtores:** Você pode ter vários construtores na mesma classe, desde que eles tenham parâmetros diferentes. Isso é chamado de sobrecarga de construtores e permite que você crie objetos de várias maneiras diferentes.

A utilização de métodos getters e setters permite encapsular os atributos de uma classe, fornecendo controle sobre o acesso a eles e garantindo que você siga o princípio de encapsulamento da POO. Construtores são usados para inicializar objetos com valores iniciais específicos. Todos esses conceitos são fundamentais para criar classes Java eficazes e bem encapsuladas.
