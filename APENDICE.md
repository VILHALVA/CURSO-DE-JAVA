# APÊNDICE
## SOBRE O PACKAGE:
Um **`package`** em Java é um mecanismo de organização e agrupamento de classes relacionadas. Ele ajuda a organizar o código, evitando conflitos de nomes de classes, e facilita a reutilização e manutenção de código, especialmente em projetos maiores.

### POR QUE USAR `PACKAGE`?
1. **Organização do código**: Em projetos grandes, com muitas classes, os pacotes ajudam a organizar o código em módulos ou grupos lógicos.
   
2. **Evitar conflitos de nomes**: Diferentes desenvolvedores podem criar classes com o mesmo nome. O uso de pacotes ajuda a evitar conflitos, já que duas classes com o mesmo nome podem existir em pacotes diferentes.

3. **Controle de acesso**: Pacotes também ajudam a controlar a visibilidade de classes, métodos e variáveis. Com o modificador de acesso **`protected`** ou sem modificador, os membros de uma classe podem ser acessados apenas por outras classes do mesmo pacote.

4. **Reutilização**: Classes de utilitários podem ser colocadas em pacotes específicos para serem reutilizadas em diferentes partes do projeto ou em diferentes projetos.

### COMO CRIAR UM `PACKAGE`?
#### PASSO 1: DECLARAR O `PACKAGE` NO ARQUIVO JAVA:
No topo do arquivo Java, você deve declarar o nome do pacote. O nome do pacote geralmente segue uma convenção baseada no domínio da empresa/organização (para evitar conflitos globais), mas você pode usar qualquer nome.

Por exemplo:

```java
package com.exemplo.meuapp;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Aqui, a classe `HelloWorld` está no pacote `com.exemplo.meuapp`. 

#### PASSO 2: ESTRUTURA DE DIRETÓRIOS:
Quando você declara um pacote, a estrutura de diretórios do projeto deve refletir o nome do pacote. No exemplo acima, a estrutura de diretórios ficaria assim:

```
C:...\CODIGO\com\exemplo\meuapp\HelloWorld.java
```

Ou seja, para o pacote `com.exemplo.meuapp`, você criaria as pastas `com`, depois dentro dela a pasta `exemplo`, e dentro dessa pasta a pasta `meuapp`.

#### PASSO 3: COMPILAR O ARQUIVO JAVA:
Quando você usa pacotes, o processo de compilação requer que você especifique o caminho relativo ao diretório raiz do projeto.

1. Navegue até o diretório raiz do projeto (o diretório que contém a pasta `com`).
   
2. Compile o arquivo com o comando:

   ```bash
   javac com/exemplo/meuapp/HelloWorld.java
   ```

   Isso irá gerar o arquivo `HelloWorld.class` dentro do mesmo pacote (`com/exemplo/meuapp/HelloWorld.class`).

#### PASSO 4: EXECUTAR O PROGRAMA:
Para executar o programa, você também precisa fornecer o caminho completo do pacote. A partir do diretório raiz do projeto, rode o seguinte comando:

```bash
java com.exemplo.meuapp.HelloWorld
```

Isso executará o programa corretamente. Note que ao rodar o comando `java`, você não usa barras (`/`), mas sim pontos (`.`), para indicar o pacote.

### CONVENÇÕES DE NOMES DE PACOTES:
Por convenção, os nomes dos pacotes são escritos em **letras minúsculas**. Isso evita problemas com sistemas de arquivos que fazem distinção entre maiúsculas e minúsculas (como Linux) e os que não fazem (como Windows).

- **Pacotes pessoais ou simples**: Se for um projeto pequeno ou pessoal, você pode usar algo simples como `meuapp`.
  
  ```java
  package meuapp;
  ```

- **Pacotes de empresas/organizações**: Em projetos de empresas, é comum usar a estrutura de domínio reverso, como `com.exemplo.projeto` (a empresa `exemplo.com` desenvolvendo o projeto `projeto`).

  ```java
  package com.exemplo.projeto;
  ```

### IMPORTANDO PACOTES:
Se você tiver classes em pacotes diferentes e quiser usá-las em outra classe, é necessário importar o pacote antes de usá-lo.

Por exemplo:

```java
import com.exemplo.outro.Categoria;

public class Produto {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
    }
}
```

Isso permite que a classe `Produto` use a classe `Categoria` que está no pacote `com.exemplo.outro`.

### CONCLUSÃO:
Os pacotes em Java são usados para organizar o código de forma eficiente, evitar conflitos de nomes, controlar o acesso às classes e facilitar a manutenção de projetos maiores. Criar e usar pacotes envolve declarar o pacote no código, organizar a estrutura de diretórios corretamente e compilar e executar o código considerando o caminho do pacote.

---

## USANDO O MVN:
O **Maven** (`mvn`) é uma ferramenta popular de automação de build e gerenciamento de dependências para projetos Java. Ele facilita o processo de construir, testar e empacotar seus projetos, além de gerenciar bibliotecas externas (dependências) de forma centralizada.

### O QUE É O `MVN`?
- **Maven** é uma ferramenta de **build** e **gerenciamento de dependências** para projetos Java.
- Ele automatiza o processo de compilação, teste, empacotamento (como gerar arquivos `.jar` ou `.war`), e gestão de dependências externas que seu projeto usa.
- Ele segue uma estrutura padrão para projetos Java e permite configurar dependências externas no arquivo `pom.xml`.

### 1. INSTALANDO O MAVEN:
#### A) BAIXAR O MAVEN:
1. Acesse o site oficial do Maven: [Download do Maven](https://maven.apache.org/download.cgi).
2. Baixe a versão binária mais recente (`apache-maven-x.x.x-bin.zip`).

#### B) INSTALAR O MAVEN:
1. **Descompacte** o arquivo baixado para um diretório em seu sistema, por exemplo: `C:\Program Files\Apache\maven`.

#### C) CONFIGURAR O MAVEN NO WINDOWS:
1. Vá ao **Painel de Controle** → **Sistema** → **Configurações Avançadas do Sistema** → **Variáveis de Ambiente**.
2. Em **Variáveis do Sistema**, encontre a variável chamada `Path`, selecione-a e clique em **Editar**.
3. Adicione uma nova entrada com o caminho para a pasta `bin` do Maven, por exemplo:
   ```
   C:\Program Files\Apache\maven\bin
   ```

4. Crie uma nova variável de ambiente chamada `MAVEN_HOME` apontando para o diretório onde você extraiu o Maven, por exemplo:
   ```
   C:\Program Files\Apache\maven
   ```

#### D) VERIFICAR SE O MAVEN ESTÁ INSTALADO CORRETAMENTE:
1. Abra um **novo terminal** (Prompt de Comando ou PowerShell) e digite o comando:
   ```bash
   mvn -v
   ```

Se tudo estiver configurado corretamente, você verá a versão do Maven e do Java instalados no seu sistema.

### 2. CRIANDO UM PROJETO MAVEN:
Agora que o Maven está instalado, vamos criar um projeto simples.

#### A) CRIAR UM NOVO PROJETO MAVEN:
1. Abra o terminal e navegue até o diretório onde você deseja criar o projeto.
2. Execute o comando para criar um projeto Java simples:

   ```bash
   mvn archetype:generate -DgroupId=com.example.app -DartifactId=meu-projeto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   ```

   Explicação:
   - `groupId`: Identifica o grupo do projeto (geralmente o nome do domínio invertido, como `com.example`).
   - `artifactId`: O nome do seu projeto (neste caso, `meu-projeto`).
   - `archetypeArtifactId`: Tipo de projeto (neste caso, `quickstart` para um projeto Java básico).

3. Navegue até a pasta do projeto gerado:
   ```bash
   cd meu-projeto
   ```

#### B) ESTRUTURA DO PROJETO:
O Maven cria uma estrutura padrão de diretórios:
```
meu-projeto/
  ├── src/
  │   └── main/
  │       └── java/
  │           └── com/
  │               └── example/
  │                   └── app/
  │                       └── App.java  # Classe Java principal
  ├── pom.xml  # Arquivo de configuração Maven
```

#### 3. CONFIGURAR DEPENDÊNCIAS NO `POM.XML`:
O arquivo `pom.xml` é o coração do seu projeto Maven. Ele contém as configurações e dependências que o Maven precisa para compilar e executar seu projeto.

Aqui está um exemplo simples de como configurar uma dependência de uma biblioteca externa (como o JUnit para testes):

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example.app</groupId>
    <artifactId>meu-projeto</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- Dependência para o JUnit (para testes) -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

### 4. EXECUTAR COMANDOS BÁSICOS NO MAVEN:
Agora que você tem um projeto, vamos aprender os comandos básicos do Maven.

#### A) COMPILAR O PROJETO:
Para compilar o código-fonte Java, use:
```bash
mvn compile
```

#### B) EXECUTAR TESTES:
Se você tiver testes automatizados, pode executá-los com:
```bash
mvn test
```

#### C) EMPACOTAR O PROJETO:
Para empacotar seu projeto em um arquivo `.jar`, use:
```bash
mvn package
```
Isso criará um arquivo `.jar` no diretório `target/`.

#### D) EXECUTAR O PROJETO JAVA:
Se o seu projeto for uma aplicação Java com um método `main`, você pode rodar o projeto diretamente usando o plugin `exec-maven-plugin`. Primeiro, adicione isso ao seu `pom.xml`:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.0.0</version>
            <configuration>
                <mainClass>com.example.app.App</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>
```

Agora, para executar seu projeto, basta rodar:
```bash
mvn exec:java
```

### CONCLUSÃO:
Com o Maven, todo o processo de construir, gerenciar dependências e empacotar seu projeto Java se torna muito mais simples e automatizado.

---
