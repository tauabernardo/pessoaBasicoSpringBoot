# Projeto JPA Simples com Spring Boot

Este projeto é um exemplo básico de uma aplicação Spring Boot utilizando JPA (Java Persistence API). O objetivo do projeto é demonstrar a implementação de um sistema simples de gerenciamento de entidades de "Pessoa".

## Estrutura do Projeto

- **.mvn**: Contém arquivos de configuração do Maven.
- **src**: Diretório principal contendo o código-fonte.
  - **main**:
    - **java**:
      - **aplicacao**: Contém a classe `Programa` que realiza operações de persistência usando JPA.
      - **com/jpasimples/projetojpasimples**: Contém a classe principal `ProjetoJpasimplesApplication`.
      - **dominio**: Contém as classes de domínio, incluindo a entidade `Pessoa`.
    - **resources**:
      - **META-INF**: Diretório tradicionalmente usado para armazenar metadados de configuração.
      - **application.properties**: Arquivo de configuração da aplicação Spring Boot.
  - **test**: Diretório destinado aos testes.
    - **java/com/jpasimples/projetojpasimples**: Pacote contendo as classes de teste da aplicação.

- **.gitignore**: Arquivo que especifica quais arquivos e diretórios devem ser ignorados pelo controle de versão Git.
- **mvnw** e **mvnw.cmd**: Scripts para garantir que a aplicação utilize uma versão específica do Maven, independente da versão instalada no sistema do desenvolvedor.
- **pom.xml**: Arquivo de configuração do Maven, onde são declaradas as dependências do projeto e outras configurações de build.

## Configuração e Execução

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- Maven 3.6 ou superior

### Passos para Executar

1. Clone o repositório:
    ```sh
    git clone <URL do repositório>
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd pessoaBasicoSpringBoot
    ```
3. Execute a aplicação usando Maven:
    ```sh
    ./mvnw spring-boot:run
    ```
   Ou, se estiver no Windows:
    ```sh
    mvnw.cmd spring-boot:run
    ```

### Classe Principal

A classe principal do projeto é `ProjetoJpasimplesApplication`:

```java
package com.jpasimples.projetojpasimples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoJpasimplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoJpasimplesApplication.class, args);
    }
}
