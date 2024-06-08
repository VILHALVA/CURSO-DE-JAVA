# MANUAL
## 1. INSTALAÇÃO DO JAVA DEVELOPMENT KIT (JDK):
O Java Development Kit (JDK) é necessário para compilar e rodar programas Java. Vamos instalar a versão mais recente do JDK.

### WINDOWS:
1. Acesse o [site oficial do Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Baixe a versão mais recente do JDK para Windows.
3. Execute o instalador e siga as instruções na tela.
4. Após a instalação, configure a variável de ambiente `JAVA_HOME`:
   - Abra o Painel de Controle.
   - Vá em Sistema e Segurança > Sistema > Configurações avançadas do sistema.
   - Clique em "Variáveis de Ambiente".
   - Em "Variáveis do sistema", clique em "Novo" e adicione `JAVA_HOME` com o caminho para o diretório de instalação do JDK, por exemplo, `C:\Program Files\Java\jdk-17`.
   - Adicione `%JAVA_HOME%\bin` ao PATH nas "Variáveis do sistema".

### MACOS:
1. Acesse o [site oficial do Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Baixe a versão mais recente do JDK para macOS.
3. Execute o instalador e siga as instruções na tela.
4. Após a instalação, abra o Terminal e configure a variável de ambiente `JAVA_HOME`:
   ```sh
   export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
   export PATH=$JAVA_HOME/bin:$PATH
   ```
   Adicione essas linhas ao seu arquivo `~/.bash_profile`, `~/.zshrc` ou `~/.bashrc` para que sejam carregadas automaticamente ao iniciar o terminal.

### LINUX:
1. Abra um terminal.
2. Execute os seguintes comandos para instalar o JDK:
   ```sh
   sudo apt update
   sudo apt install openjdk-17-jdk
   ```
3. Configure a variável de ambiente `JAVA_HOME` adicionando as seguintes linhas ao seu arquivo `~/.bashrc` ou `~/.zshrc`:
   ```sh
   export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
   export PATH=$JAVA_HOME/bin:$PATH
   ```

Para verificar se a instalação foi bem-sucedida, execute o comando:
```sh
java -version
```

## 2. CONFIGURAÇÃO DA IDE (INTEGRATED DEVELOPMENT ENVIRONMENT):
Usar uma IDE facilita muito o desenvolvimento em Java. Uma das IDEs mais populares é o IntelliJ IDEA.

### INTELLIJ IDEA:
1. Acesse o [site do IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
2. Baixe a versão Community (gratuita) ou a versão Ultimate (paga).
3. Instale a IDE seguindo as instruções para o seu sistema operacional.

## 3. CRIANDO O PRIMEIRO PROJETO EM JAVA:
### PASSO A PASSO PARA CRIAR UM PROJETO NO INTELLIJ IDEA:
1. Abra o IntelliJ IDEA.
2. Clique em "New Project".
3. Selecione "Java" no menu à esquerda.
4. Em "Project SDK", selecione o JDK que você instalou.
5. Clique em "Next" e depois em "Next" novamente.
6. Nomeie seu projeto e selecione o diretório onde ele será salvo. Clique em "Finish".

### CRIANDO UM ARQUIVO JAVA:
1. No painel do lado esquerdo, clique com o botão direito na pasta `src`.
2. Selecione "New" > "Java Class".
3. Nomeie a classe como `HelloWorld` e clique em "OK".

### ESCREVENDO O CÓDIGO:
No arquivo `HelloWorld.java` que foi criado, escreva o seguinte código:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### EXECUTANDO O PROJETO:
1. Clique com o botão direito no arquivo `HelloWorld.java`.
2. Selecione "Run 'HelloWorld.main()'".

Você verá a mensagem `Hello, World!` impressa na janela do console.

## CONCLUSÃO:
Agora você tem o JDK instalado, configurado e um ambiente de desenvolvimento Java pronto com o IntelliJ IDEA. Você criou e executou seu primeiro projeto Java. A partir daqui, você pode explorar mais sobre a linguagem Java, bibliotecas e frameworks para expandir suas habilidades de programação.