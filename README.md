# CURSO-DE-JAVA
👨‍⚖️CURSO COMPRETO DE JAVA.

[![GitHub Repo stars](https://img.shields.io/badge/VILHALVA-GITHUB-03A9F4?logo=github)](https://github.com/VILHALVA) 
[![GitHub Repo stars](https://img.shields.io/badge/VEJA-DOCUMENTAÇÃO-03A9F4?logo=google)](https://docs.oracle.com/en/java/) <br>

[![GitHub Repo stars](https://img.shields.io/badge/CURSO-JAVA%20BASICO-03A9F4?logo=youtube)](https://www.youtube.com/playlist?list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR)
[![GitHub Repo stars](https://img.shields.io/badge/CURSO-JAVA%20POO-03A9F4?logo=youtube)](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY) <br>

<img src="https://gabrielaugusto.me/wp-content/uploads/2021/06/Java_Logo.png" align="center" width="280"> <br>

# 🤖REQUISITOS:
* 🤯[SABER LÓGICA DE PROGRAMAÇÃO](https://github.com/VILHALVA/CURSO-DE-ALGORITMO)
* 💻[INSTALAR O JAVA](https://www.java.com/pt-BR/)
* 💻[BAIXAR O JDK](https://www.oracle.com/br/java/technologies/downloads/)
* 💻[INSTALAR O NETBEANS IDE](https://netbeans.apache.org/download/archive/index.html)

# 🎩TEMATICAS:
## [JAVA BÁSICO:](https://www.youtube.com/playlist?list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR)
* ✅ JAVA SWING
* ✅ JAVA FEX
* ✅ OPERADORES ARIMÉTICOS, LÓGICOS E RELACIONAIS
* ✅ VARIAVEIS E TIPOS PRIMITIVOS
* ✅ TRATAMENTO DE DADOS
* ✅ ESTRUTURA CONDICIONAL COMPOSTA
* ✅ ESTRUTURA CONDICIONAL ANINHADA
* ✅ ESTRUTURA CONDICIONAL SWITCH
* ✅ ESTRUTURA DE REPETIÇÃO WHILE
* ✅ ESTRUTURA DE REPETIÇÃO FOR
* ✅ VETORES (VARIAVEIS COMPOSTAS 1)
* ✅ METODOS (VARIAVEIS COMPOSTAS 2)

## [JAVA POO:](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)
* ✅ CLASSES E OBJETOS
* ✅ CONFIGURANDO VISIBILIDADE
* ✅ METODOS GSC
* ✅ PILARES DO POO
* ✅ ENCAPSULAMENTO
* ✅ HERANÇA
* ✅ POLIMORFISMO

![](https://i.imgur.com/waxVImv.png)
# 👀VISÃO PANORÂMICA:
| PERGUNTA | RESPOSTA |
| :---: | :---: |
| DATA DE CRIAÇÃO | 1991 |
| NOME DO CRIADOR | James Gosling, Mike Sheridan e Patrick Naughton | 
| SIGNIFICADO DO NOME | Acredita-se que o nome "Java" tenha sido inspirado pelo café Java, que é cultivado na Indonésia e era uma bebida popular entre a equipe de desenvolvimento. |
| É BASEADA NO | C C++ |
| EXTENÇÃO DO ARQUIVO | .java |
| É MAIS USADA | Criação de Apps para Android |

* O Java foi criado por James Gosling, Mike Sheridan e Patrick Naughton na Sun Microsystems, que mais tarde foi adquirida pela Oracle Corporation. O desenvolvimento da linguagem começou em 1991 e a primeira versão pública do Java, chamada de Java 1.0, foi lançada em 1996.
* O nome "Java" foi escolhido inicialmente como um substituto temporário para o nome original, "Oak". No entanto, a equipe de desenvolvimento acabou gostando do nome e decidiu mantê-lo. Acredita-se que o nome "Java" tenha sido inspirado pelo café Java, que é cultivado na Indonésia e era uma bebida popular entre a equipe de desenvolvimento.
* O Java é uma linguagem de programação de propósito geral que foi projetada para ser portável, segura e fácil de usar. Uma das principais características do Java é sua capacidade de executar em diferentes plataformas, conhecida como "write once, run anywhere" (escreva uma vez, execute em qualquer lugar). Isso é possível devido à máquina virtual Java (JVM), que permite que os programas Java sejam executados em diferentes sistemas operacionais sem a necessidade de modificação do código-fonte.
* O Java é mais conhecido por seu uso no desenvolvimento de aplicativos empresariais e sistemas distribuídos. É amplamente utilizado para criar aplicativos de desktop, aplicativos móveis para Android, sistemas de gerenciamento de bancos de dados, servidores de aplicativos, sistemas de mensagens, sistemas de comércio eletrônico e muito mais.
* Além disso, o Java também é usado em várias outras áreas, como desenvolvimento de jogos, aplicativos científicos, sistemas embarcados e Internet das Coisas (IoT).
* Em resumo, o Java é uma linguagem de programação amplamente usada, criada por James Gosling e sua equipe na Sun Microsystems. Ele é conhecido por sua portabilidade, segurança e uso em uma variedade de domínios de aplicativos, com destaque para o desenvolvimento de aplicativos empresariais e sistemas distribuídos.

# 🎁SINTAXE DA LINGUAGEM:
## 0) FUNDAMENTOS:
Aqui está um exemplo de código em Java que utiliza os operadores aritméticos, relacionais e lógicos com os tipos primitivos:
```java
public class ExemploOperadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;     // Soma: 15
        int subtracao = a - b;  // Subtração: 5
        int multiplicacao = a * b;  // Multiplicação: 50
        int divisao = a / b;  // Divisão: 2
        int resto = a % b;  // Resto da divisão: 0

        // Operadores relacionais
        boolean igual = a == b;  // Igualdade: false
        boolean diferente = a != b;  // Diferença: true
        boolean maior = a > b;  // Maior que: true
        boolean menor = a < b;  // Menor que: false
        boolean maiorIgual = a >= b;  // Maior ou igual a: true
        boolean menorIgual = a <= b;  // Menor ou igual a: false

        // Operadores lógicos
        boolean condicao1 = (a > 0) && (b > 0);  // AND lógico: true
        boolean condicao2 = (a > 0) || (b > 0);  // OR lógico: true
        boolean negacao = !(a > 0);  // NOT lógico: false

        // Imprimindo os resultados
        System.out.println("Operadores aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);

        System.out.println("\nOperadores relacionais:");
        System.out.println("Igualdade: " + igual);
        System.out.println("Diferença: " + diferente);
        System.out.println("Maior que: " + maior);
        System.out.println("Menor que: " + menor);
        System.out.println("Maior ou igual a: " + maiorIgual);
        System.out.println("Menor ou igual a: " + menorIgual);

        System.out.println("\nOperadores lógicos:");
        System.out.println("AND lógico: " + condicao1);
        System.out.println("OR lógico: " + condicao2);
        System.out.println("NOT lógico: " + negacao);
    }
}
```
Neste exemplo, utilizamos os operadores aritméticos (soma, subtração, multiplicação, divisão e resto), os operadores relacionais (igualdade, diferença, maior que, menor que, maior ou igual a, menor ou igual a) e os operadores lógicos (AND, OR e NOT).

As variáveis `a` e `b` são declaradas como `int` e atribuídas valores. Em seguida, utilizamos os operadores para realizar operações aritméticas, comparações e avaliações lógicas. Os resultados são armazenados em variáveis ou impressos diretamente no console.

Dessa forma, o exemplo demonstra a utilização dos diferentes tipos de operadores em Java com os tipos primitivos, mostrando como eles podem ser aplicados para realizar cálculos, comparações e avaliações lógicas em um programa.

## 1) VARIAVEIS SIMPLES:
Em Java, as variáveis simples são usadas para armazenar valores individuais de um determinado tipo de dado. Aqui está um exemplo de declaração e inicialização de variáveis simples em Java:
````java
public class ExemploVariaveis {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis

        int idade = 30; // Variável do tipo int para armazenar a idade
        double altura = 1.75; // Variável do tipo double para armazenar a altura
        char sexo = 'M'; // Variável do tipo char para armazenar o sexo
        boolean possuiCarro = true; // Variável do tipo boolean para armazenar se a pessoa possui um carro

        // Impressão dos valores das variáveis

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Possui Carro: " + possuiCarro);
    }
}
````
Neste exemplo, declaramos e inicializamos quatro variáveis simples:
* idade é uma variável do tipo int que armazena um valor numérico inteiro.
* altura é uma variável do tipo double que armazena um valor numérico de ponto flutuante.
* sexo é uma variável do tipo char que armazena um único caractere.
* possuiCarro é uma variável do tipo boolean que armazena um valor lógico (verdadeiro ou falso).
Após a inicialização das variáveis, utilizamos o método System.out.println() para imprimir os valores das variáveis na saída do console. Ao executar o código, você verá a seguinte saída:
````java
Idade: 30
Altura: 1.75
Sexo: M
Possui Carro: true
````
Esses são exemplos simples de variáveis em Java. Existem diferentes tipos de dados disponíveis em Java, cada um com suas características e usos específicos. A escolha do tipo de dado adequado depende do valor que você deseja armazenar e manipular em seu programa.

Em Java, para receber uma entrada de dados do usuário, você pode utilizar a classe `Scanner` que faz parte da biblioteca padrão. Aqui está um exemplo de como usar o `Scanner` para receber uma entrada de dados:

```java
import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Número digitado: " + numero);
        System.out.println("Nome digitado: " + nome);

        scanner.close();
    }
}
```
Neste exemplo, utilizamos o `Scanner` para receber uma entrada de dados do usuário. Primeiro, criamos uma instância do `Scanner` passando `System.in` como argumento, que representa a entrada padrão do sistema, ou seja, o teclado.

Em seguida, utilizamos o método `nextInt()` para ler um número inteiro digitado pelo usuário e armazená-lo na variável `numero`. E utilizamos o método `nextLine()` para ler uma linha de texto digitada pelo usuário e armazená-la na variável `nome`.

Por fim, imprimimos os valores digitados pelo usuário no console.

É importante chamar o método `close()` no final para liberar os recursos do `Scanner`.

Dessa forma, você pode utilizar o `Scanner` para receber entradas de dados do usuário em Java.

## 2) ESTRUTURA CONDICIONAL:
Em Java, a estrutura condicional permite executar blocos de código com base em condições específicas. Existem três tipos principais de estruturas condicionais em Java: if, if-else, e switch. Vou fornecer exemplos de cada uma delas:

### ESTRUTURA IF:
````java
int idade = 18;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
````
Nesse exemplo, o bloco de código dentro do if será executado apenas se a condição idade >= 18 for verdadeira.

### ESTRUTURA IF-ELSE:
````java
int idade = 16;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} 
else {
    System.out.println("Você é menor de idade.");
}
````
Nesse exemplo, o bloco de código dentro do if será executado se a condição idade >= 18 for verdadeira. Caso contrário, o bloco de código dentro do else será executado.

### ESTRUTURA SWITCH:
````java
int diaDaSemana = 3;
String nomeDia;
switch (diaDaSemana) {
    case 1:
        nomeDia = "Domingo";
        break;
    case 2:
        nomeDia = "Segunda-feira";
        break;
    case 3:
        nomeDia = "Terça-feira";
        break;
    case 4:
        nomeDia = "Quarta-feira";
        break;
    case 5:
        nomeDia = "Quinta-feira";
        break;
    case 6:
        nomeDia = "Sexta-feira";
        break;
    case 7:
        nomeDia = "Sábado";
        break;
    default:
        nomeDia = "Dia inválido";
        break;
}
System.out.println("Hoje é " + nomeDia);
````
Nesse exemplo, a variável diaDaSemana é avaliada em uma série de casos no switch. Dependendo do valor de diaDaSemana, o bloco de código correspondente ao caso será executado. Se o valor não corresponder a nenhum caso, o bloco de código dentro do default será executado. Esses são exemplos básicos de estruturas condicionais em Java. Elas permitem que você tome decisões em seu código com base em condições específicas, tornando seu programa mais flexível e adaptável.

## 3) ESTRUTURA DE REPETIÇÃO:
### ESTRUTURA FOR:
````java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
````
Nesse exemplo, o bloco de código dentro do for será repetido cinco vezes. A variável i é inicializada com 1, a condição i <= 5 é verificada a cada iteração e, após cada iteração, o valor de i é incrementado em 1.

### ESTRUTURA WHILE:
````java
int i = 1;
while (i <= 5) {
    System.out.println("Número: " + i);
    i++;
}
````
Nesse exemplo, o bloco de código dentro do while será repetido enquanto a condição i <= 5 for verdadeira. O valor de i é incrementado em 1 a cada iteração.

### ESTRUTURA DO-WHILE:
````java
int i = 1;
do {
    System.out.println("Número: " + i);
    i++;
} 
while (i <= 5);
````
Nesse exemplo, o bloco de código dentro do do será executado pelo menos uma vez, mesmo se a condição i <= 5 for falsa. Após cada iteração, a condição é verificada e o bloco de código continuará sendo repetido enquanto a condição for verdadeira. Essas são as estruturas de repetição básicas em Java. Elas permitem que você execute blocos de código repetidamente com base em uma condição específica ou um número específico de iterações, tornando seu programa mais eficiente e flexível.

## 4) VARIAVEIS COMPOSTAS:
Em Java, existem várias formas de lidar com variáveis compostas, que permitem armazenar e manipular conjuntos de valores relacionados. Alguns exemplos de variáveis compostas em Java são: arrays, listas, conjuntos e mapas. Aqui estão exemplos de algumas dessas variáveis compostas em Java:

### ARRAYS:
````java
int[] numeros = {1, 2, 3, 4, 5}; // Array de inteiros
String[] nomes = {"João", "Maria", "José"}; // Array de strings
double[] valores = new double[5]; // Array vazio de doubles com tamanho definido

System.out.println(numeros[0]); // Acessando o primeiro elemento do array
System.out.println(nomes[1]); // Acessando o segundo elemento do array
valores[2] = 3.14; // Atribuindo um valor ao terceiro elemento do array
````

### LISTAS:
````java
import java.util.ArrayList;
import java.util.List;

List<Integer> numeros = new ArrayList<>(); // Lista de inteiros
List<String> nomes = new ArrayList<>(); // Lista de strings

numeros.add(1); // Adicionando um elemento à lista
numeros.add(2);
numeros.add(3);

System.out.println(numeros.get(1)); // Acessando o segundo elemento da lista
````

### CONJUNTOS (SETS):
````java
import java.util.HashSet;
import java.util.Set;

Set<String> nomes = new HashSet<>(); // Conjunto de strings

nomes.add("João"); // Adicionando elementos ao conjunto
nomes.add("Maria");
nomes.add("José");
nomes.add("Maria"); // Elementos duplicados não são permitidos em um conjunto

System.out.println(nomes.size()); // Obtendo o tamanho do conjunto
````

### MAPAS (MAP):
````java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> idadePorNome = new HashMap<>(); // Mapa que associa nomes a idades

idadePorNome.put("João", 30); // Associando um nome a uma idade
idadePorNome.put("Maria", 25);
idadePorNome.put("José", 40);

System.out.println(idadePorNome.get("Maria")); // Obtendo a idade associada ao nome "Maria"
````
Esses são apenas alguns exemplos de variáveis compostas em Java. Cada uma delas tem suas características e métodos específicos que permitem manipular e acessar os elementos armazenados. A escolha da variável composta adequada depende dos requisitos e da estrutura dos dados que você precisa manipular em seu programa.

## 5) FUNÇÕES:
Em Java, as funções são chamadas de métodos. Os métodos são blocos de código que podem ser reutilizados para executar uma tarefa específica. Eles ajudam a organizar e modularizar o código, tornando-o mais legível e fácil de manter. Aqui está um exemplo de como definir e chamar um método em Java:
````java
public class ExemploFuncoes {
    public static void main(String[] args) {
        // Chamando o método somarNumeros e armazenando o resultado em uma variável
        int resultado = somarNumeros(5, 3);
        System.out.println("O resultado da soma é: " + resultado);
    }

    // Definindo o método somarNumeros que recebe dois inteiros como parâmetros
    public static int somarNumeros(int a, int b) {
        int soma = a + b;
        return soma; // Retornando o resultado da soma
    }
}
````
Nesse exemplo, temos o método somarNumeros que recebe dois números inteiros como parâmetros. Ele calcula a soma dos dois números e retorna o resultado. No método main, chamamos o método somarNumeros passando os valores 5 e 3 como argumentos. O valor retornado pelo método é armazenado na variável resultado e, em seguida, é impresso na saída do console. Aqui está a saída correspondente:
````java
O resultado da soma é: 8
````
Além disso, em Java, existem também os métodos de instância que pertencem a uma classe específica e precisam ser invocados em uma instância dessa classe. Esses métodos são definidos sem o modificador static. No entanto, o exemplo acima ilustra o uso de um método estático, que pode ser chamado diretamente sem a necessidade de criar uma instância da classe. É possível definir métodos com diferentes tipos de retorno (incluindo void para métodos que não retornam um valor) e diferentes combinações de parâmetros. Os métodos podem ser usados para realizar uma ampla variedade de tarefas e são uma parte fundamental da programação em Java.

## 6) CLASS POO:
Class com todos os 4 pilares da programação orientada a objetos: encapsulamento, herança, polimorfismo e abstração:
````java
// Exemplo de classe em Java usando os pilares da programação orientada a objetos

// Abstração: Criando a classe abstrata Animal
abstract class Animal {
    private String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public abstract void fazerSom(); // Método abstrato que será implementado nas classes derivadas
    
    public String getNome() {
        return nome;
    }
}

// Herança: Criando a classe Cachorro que herda de Animal
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo.");
    }
}

// Polimorfismo: Criando a classe Gato que também herda de Animal
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
    
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está miando.");
    }
}

// Encapsulamento: Criando a classe principal que utiliza as classes Animal, Cachorro e Gato
public class ExemploPilaresPOO {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Totó");
        cachorro.fazerSom();
        
        Animal gato = new Gato("Felix");
        gato.fazerSom();
    }
}
````
Nesse exemplo, temos a classe abstrata Animal que representa a abstração de um animal genérico. Ela possui um construtor que recebe o nome do animal e um método abstrato fazerSom(), que será implementado nas classes derivadas. As classes Cachorro e Gato herdam da classe Animal e implementam o método fazerSom() de acordo com as características específicas de cada animal. Na classe principal ExemploPilaresPOO, são criadas instâncias de Cachorro e Gato e chamados os métodos fazerSom() de cada um deles. Isso demonstra o polimorfismo, pois mesmo sendo chamados através da referência do tipo Animal, o comportamento específico de cada classe é executado. O encapsulamento é demonstrado pelo uso dos modificadores de acesso private e public para controlar o acesso aos atributos e métodos das classes. Dessa forma, esse exemplo utiliza os pilares da programação orientada a objetos para criar uma hierarquia de classes com comportamentos específicos e reaproveitáveis, promovendo a modularidade e a flexibilidade do código.

# 🛑REGRAS DO JAVA:
* 1 - É preciso importar o pacote do diretório na qual o arquivo está localizado.
* 2 - Para dar nome de um arquivo, função, variavel, classe e metodo, é preciso obedecer a lei do "camelo" (Camel Case): "NomeDoArquivo.java".
* 3 - A class pública tem que ter o mesmo nome do arquivo.
* 4 - É preciso criar class (POO) até para escrever "olá mundo" no console.
* 5 - Ao declarar uma variavél, terá que informar se ela é "int", "float" ou "string" ("String" é objeto).
* 6 - Ao usar um input para números, terá que fazer a conversão "Integer.parseInt".
* 7 - É preciso colocar ";" no fim de cada comando.
* 8 -  A IDE cria o bycode do código que será usada por multiplas JVMs (Para Android, Linux e Windows).

# 💖CARACTERISTICAS DA LINGUAGEM:
## ❤POSITIVAS:
* **1 - Simplicidade:** A sintaxe do Java é fácil de ler e entender, o que facilita o desenvolvimento e a manutenção do código. A linguagem foi projetada para ser simples e intuitiva, o que a torna acessível até mesmo para programadores iniciantes.
* **2 - Portabilidade:** Uma das principais vantagens do Java é sua portabilidade. Os programas escritos em Java podem ser executados em diferentes plataformas, como Windows, macOS e Linux, sem a necessidade de alterar o código-fonte. Isso é possível devido à máquina virtual Java (JVM), que interpreta o código Java e o traduz para a linguagem de máquina específica da plataforma em que está sendo executado.
* **3 - Orientação a Objetos:** Java é uma linguagem orientada a objetos, o que significa que ela suporta conceitos fundamentais de programação orientada a objetos, como encapsulamento, herança, polimorfismo e abstração. Essa abordagem promove a modularidade, reutilização de código e facilita a criação de programas bem estruturados e escaláveis.
* **4 - Grande biblioteca padrão:** Java possui uma biblioteca padrão abrangente, conhecida como Java Standard Library (JSL), que fornece uma ampla gama de classes e métodos para realizar tarefas comuns de programação. Essa biblioteca inclui utilitários para manipulação de strings, operações de entrada e saída, processamento de arquivos, networking, entre outros. Isso acelera o desenvolvimento, pois muitas funcionalidades já estão disponíveis e prontas para uso.
* **5 - Comunidade ativa e suporte:** Java possui uma comunidade de desenvolvedores muito ativa e um amplo suporte da Oracle, empresa responsável pelo desenvolvimento e manutenção da linguagem. Isso significa que você pode encontrar uma vasta quantidade de recursos, tutoriais, documentação e fóruns online para obter ajuda e aprender novas técnicas.
* **6 - Segurança:** Java possui recursos de segurança robustos integrados em sua plataforma. A JVM executa o código Java em um ambiente sandbox, que restringe o acesso a recursos do sistema operacional, como o sistema de arquivos e rede. Isso ajuda a evitar a execução de código malicioso e a proteger o computador e os dados.

## 🖤NEGATIVAS:
* **1 - Verbosidade:** O Java é conhecido por sua verbosidade, o que significa que é necessário escrever mais linhas de código em comparação com outras linguagens de programação para realizar certas tarefas. Isso pode levar a um código-fonte mais extenso e complexo, tornando o desenvolvimento mais demorado.
* **2 - Curva de Aprendizado:** Java possui uma curva de aprendizado íngreme para iniciantes, especialmente para aqueles que não têm experiência prévia em programação. A sintaxe complexa e a grande quantidade de conceitos de programação orientada a objetos podem tornar o aprendizado inicial do Java um pouco desafiador. 
* **3 - Desempenho Relativo:** Embora o Java tenha um desempenho sólido em muitos casos, algumas pessoas argumentam que ele pode ser um pouco mais lento em comparação com outras linguagens de programação de baixo nível, como C ou C++. Isso ocorre porque o código Java precisa ser executado em uma máquina virtual, adicionando uma camada de abstração entre o código e o sistema operacional.
* **4 - Consumo de Memória:** A execução do código Java requer a alocação de memória para a JVM (Java Virtual Machine), o que pode resultar em um consumo relativamente alto de memória em comparação com algumas outras linguagens. Isso pode ser uma preocupação em ambientes com recursos limitados, como dispositivos embarcados ou sistemas com restrições de memória.
* **5 - Gerenciamento de Memória:** Embora o Java forneça o gerenciamento automático de memória através do coletor de lixo (garbage collector), alguns desenvolvedores argumentam que essa abordagem pode levar a picos de uso de memória e latências imprevisíveis. Em cenários de alto desempenho ou em sistemas que exigem controle preciso sobre a alocação e liberação de memória, a falta de controle direto sobre o gerenciamento de memória pode ser vista como uma desvantagem.
