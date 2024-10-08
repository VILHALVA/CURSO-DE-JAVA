# POLIMORFISMO PARTE 2 - SOBRECARGA 

<img src="./IMAGENS/TIPOS DE POLIMORFISMO.png" align="center" width="400"> <br>
<img src="./IMAGENS/SOBRECARGA 01.png" align="center" width="400"> <br>

Na Programação Orientada a Objetos (POO), o polimorfismo também pode ser alcançado por meio da sobrecarga de métodos. A sobrecarga de métodos ocorre quando uma classe tem vários métodos com o mesmo nome, mas com parâmetros diferentes. Isso permite que você use o mesmo nome de método para realizar tarefas diferentes, com base nos argumentos passados a ele.

**Conceito de Sobrecarga de Métodos:**

A sobrecarga de métodos envolve a definição de múlticos métodos com o mesmo nome na mesma classe, mas com diferentes listas de parâmetros (tipos e/ou quantidade). O compilador Java determina qual método deve ser chamado com base nos argumentos passados quando o método é invocado.

**Regras para a Sobrecarga de Métodos:**

Para realizar uma sobrecarga de métodos bem-sucedida, siga estas regras:

1. Os nomes dos métodos devem ser iguais.

2. A lista de parâmetros deve ser diferente em pelo menos um dos seguintes aspectos: número de parâmetros, tipos de parâmetros ou ordem dos tipos de parâmetros.

3. O tipo de retorno não é considerado ao determinar a sobrecarga de métodos; ele não é suficiente para diferenciar os métodos.

**Exemplo de Sobrecarga de Métodos:**

Vamos criar um exemplo simples de sobrecarga de métodos em Java. Primeiro, criaremos uma classe `Calculadora` com três métodos chamados `soma` que realizam adições com diferentes tipos de parâmetros.

```java
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public String soma(String a, String b) {
        return a + b;
    }
}
```

Neste exemplo, a classe `Calculadora` possui três métodos com o mesmo nome, `soma`, mas cada um deles tem uma lista de parâmetros diferente (inteiros, duplos e strings).

**Usando a Sobrecarga de Métodos:**

Agora você pode usar esses métodos com o mesmo nome de maneira polimórfica, dependendo dos argumentos passados:

```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoInt = calc.soma(5, 10);
        double resultadoDouble = calc.soma(5.5, 10.3);
        String resultadoString = calc.soma("Hello, ", "world!");

        System.out.println("Resultado Inteiro: " + resultadoInt);
        System.out.println("Resultado Duplo: " + resultadoDouble);
        System.out.println("Resultado String: " + resultadoString);
    }
}
```

Neste exemplo, a classe `Main` cria um objeto `Calculadora` e invoca o método `soma` com diferentes tipos de argumentos. O Java selecionará automaticamente o método apropriado com base nos tipos de parâmetros.

A sobrecarga de métodos é uma maneira eficaz de criar interfaces mais flexíveis e intuitivas em sua classe, permitindo que você use o mesmo nome de método para realizar tarefas relacionadas, mas com diferentes tipos de argumentos. Isso torna o código mais legível e reduz a necessidade de criar nomes de métodos complicados para acomodar variações nos tipos de argumentos.