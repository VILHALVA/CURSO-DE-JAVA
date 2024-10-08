# PRIMEIRO PROGRAMA
Começaremos com um exemplo simples de um programa Java. Vamos criar um programa que exibe a mensagem "Olá, mundo!" na tela. Este é geralmente o primeiro programa que os desenvolvedores Java escrevem para se familiarizarem com a linguagem. Vamos passo a passo:

```java
public class OlaMundo {
    public static void main(String[] args) {
        // Aqui vamos escrever o código do nosso programa
        System.out.println("Olá, mundo!");
    }
}
```

Aqui está uma explicação do código:

1. `public class OlaMundo`: Isso define uma classe chamada `OlaMundo`. Em Java, um programa é geralmente organizado em classes, e o nome da classe deve ser o mesmo que o nome do arquivo Java (neste caso, "OlaMundo.java").

2. `public static void main(String[] args)`: Isso declara um método chamado `main`. O método `main` é o ponto de entrada de um programa Java. Ele deve sempre ter esse nome e a assinatura exata (recebendo um array de strings como argumento).

3. `System.out.println("Olá, mundo!");`: Esta linha exibe "Olá, mundo!" na saída padrão (normalmente a tela). O `System.out` representa a saída padrão, e `println` é um método que imprime uma linha de texto.

Para executar este programa, siga estas etapas:

1. Certifique-se de ter o ambiente de desenvolvimento Java instalado em seu computador.

2. Crie um arquivo chamado `OlaMundo.java` e cole o código acima nele.

3. Abra um terminal ou prompt de comando e navegue até o diretório onde você salvou o arquivo `OlaMundo.java`.

4. Compile o programa digitando o seguinte comando:

   ```
   javac OlaMundo.java
   ```

   Isso irá gerar um arquivo chamado `OlaMundo.class` no mesmo diretório.

5. Execute o programa com o seguinte comando:

   ```
   java OlaMundo
   ```

Você verá a mensagem "Olá, mundo!" impressa na tela. Este é um exemplo simples, mas fundamental, que demonstra a estrutura básica de um programa Java. A partir daqui, você pode explorar conceitos mais avançados e construir aplicativos Java mais complexos.