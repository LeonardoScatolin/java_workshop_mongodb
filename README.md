# WorkshopMongo - Projeto Spring Boot com MongoDB

## Sobre o Projeto

Este é um projeto de exemplo para demonstrar a criação de uma aplicação Spring Boot integrada com MongoDB. O projeto abrange a criação de entidades como `User` e `Post`, bem como suas operações CRUD correspondentes.

## Tecnologias Utilizadas

- Spring Boot
- MongoDB
- Spring Data MongoDB

## Estrutura do Projeto

O projeto está organizado em diferentes pacotes, cada um com sua responsabilidade:

- `com.leonardo.workshopmongo.config`: Configuração inicial para a inicialização de dados.
- `com.leonardo.workshopmongo.domain`: Classes de domínio (`User` e `Post`).
- `com.leonardo.workshopmongo.dto`: DTOs para representação de dados.
- `com.leonardo.workshopmongo.repository`: Repositórios para operações com o MongoDB.
- `com.leonardo.workshopmongo.resources`: Controladores REST para manipulação dos recursos.
- `com.leonardo.workshopmongo.services`: Serviços para lógica de negócios e acesso ao banco de dados.
- `com.leonardo.workshopmongo.services.exceptions`: Classes de exceção personalizadas.

## Funcionalidades Principais

1. **User**: Operações CRUD para gerenciamento de usuários.
2. **Post**: Operações CRUD para gerenciamento de posts, incluindo comentários.
3. **Pesquisa Avançada**: Consultas personalizadas para busca de posts por título e intervalo de datas.

## Endpoints REST

### Usuários

- `GET /users`: Listar todos os usuários.
- `GET /users/{id}`: Buscar usuário por ID.
- `POST /users`: Criar um novo usuário.
- `PUT /users/{id}`: Atualizar um usuário existente.
- `DELETE /users/{id}`: Excluir um usuário.

### Posts

- `GET /posts/{id}`: Buscar post por ID.
- `GET /posts/titlesearch?text={text}`: Buscar posts por título.
- `GET /posts/fullsearch?text={text}&minDate={minDate}&maxDate={maxDate}`: Pesquisa avançada de posts.
