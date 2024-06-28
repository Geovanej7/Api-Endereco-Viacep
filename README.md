# Endereço Viacep

Endereço Viacep é um dos desafios de projeto proposto pela DIO no fim da formação Java Developer. Esta API integra com a API do Viacep para obter informações de endereço a partir de um CEP. Foi uma experiência de aprendizado valiosa e tenho certeza que utilizarei esse conhecimento no futuro.

## Descrição

A API permite obter todas as informações de um endereço de usuário apenas informando seu CEP. Aproveitei a liberdade dada pelo GRANDE professor Venilton para fazer algumas modificações, como a utilização do Lombok para tornar o código mais limpo e o uso do Docker para subir um container e se conectar com o PostgreSQL, permitindo salvar esses dados em uma base sólida.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Swagger
- Lombok
- Docker
- PostgreSQL
- API Viacep

## Funcionalidades

- Obtenção de informações de endereço a partir do CEP
- Salvamento de dados de endereço em um banco de dados PostgreSQL

## Como Rodar o Projeto Localmente

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/endereco-viacep.git
    ```
   
2. Navegue até o diretório do projeto:
    ```sh
    cd endereco-viacep
    ```

3. Suba o container Docker com o comando:
    ```sh
    docker-compose up
    ```

4. Dê start no projeto e observe seu funcionamento localmente pelo Swagger na URL:
    ```sh
    http://localhost:8080/swagger-ui/index.html
    ```

### Pré-requisitos

- Docker instalado
- Java 17 instalado

