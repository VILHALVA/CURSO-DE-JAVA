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

## 2. USANDO QUALQUER IDE (OU BLOCO DE NOTAS): 
### PASSO 1: CRIAR O ARQUIVO JAVA:
1. **Abra o Bloco de Notas**.
2. Digite o seguinte código:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

3. Salve o arquivo como **HelloWorld.java**. Certifique-se de escolher o tipo de arquivo como **Todos os arquivos** (`*.txt`) no Bloco de Notas para garantir que a extensão do arquivo seja `.java`, e não `.txt`. Lembre-se que o nome da classe pública no código (HelloWorld) deve corresponder exatamente ao nome do arquivo.

### PASSO 2: COMPILAR O PROGRAMA:
1. Abra o **Prompt de Comando**.
2. Navegue até o diretório onde você salvou o arquivo `HelloWorld.java` usando o comando `cd`. Exemplo:

   ```bash
   cd C:\caminho\para\o\arquivo
   ```

3. Compile o arquivo Java com o seguinte comando:

   ```bash
   javac HelloWorld.java
   ```

   Isso irá gerar um arquivo **HelloWorld.class**, que é o bytecode que será executado pela JVM (Java Virtual Machine).

### PASSO 3: EXECUTAR O PROGRAMA:
1. Ainda no **Prompt de Comando**, execute o programa com o seguinte comando:

   ```bash
   java HelloWorld
   ```

   Você verá a saída:

   ```
   Hello, World!
   ```

- Agora você terá seu programa "Hello, World!" rodando em Java!

## CONCLUSÃO:
Agora você tem o JDK instalado, configurado e um ambiente de desenvolvimento Java pronto com o IntelliJ IDEA. Você criou e executou seu primeiro projeto Java. A partir daqui, você pode explorar mais sobre a linguagem Java, bibliotecas e frameworks para expandir suas habilidades de programação.