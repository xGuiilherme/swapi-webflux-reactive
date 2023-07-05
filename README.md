## StarWars API - Consulte informações sobre filmes.
Projeto simples para consumir uma API externa utilizando Feign Client. Esta API foi construida usando o Spring Boot 3 e Java 11 e permite que os usuários realizem consultas sobre filmes.

## Pré-requisitos
Para executar esta API, você precisa ter instalado:

- Java 11
- Maven 3.X

## Endpoint
- localhost:8080/reactive-feign/person/{id}
- localhost:8080/reactive-feign/movie/{id}

| Method | Route                         | Description                     | Body required |
|--------|-------------------------------|---------------------------------|---------------|
| GET    | `/reactive-feign/person/{id}` | Buscar pessoa por ID específico | false         |
| GET    | `/reactive-feign/movie/{id} ` | Buscar filme por ID específico  | false         |

## Retorno da consulta no formato JSON
Após realizar a consulta do SWAPI, você pode visualizar o conteúdo retornado no formato JSO.
- obs: Abaixo um exemplo do retorno para pessoa e filme.
```json
"results": [
{
     "name": "Luke Skywalker", 
     "height": "172", 
     "mass": "77", 
     "hair_color": "blond", 
     "skin_color": "fair", 
     "eye_color": "blue", 
     "birth_year": "19BBY", 
     "gender": "male", 
     "homeworld": "https://swapi.dev/api/planets/1/"
  ]
}
"results": [
 {
     "title": "A New Hope", 
     "episode_id": 4, 
     "opening_crawl": "descrição do filme", 
     "director": "George Lucas", 
     "producer": "Gary Kurtz, Rick McCallum", 
     "release_date": "1977-05-25"
  ]
}
```
Para ter acesso a API do 'swapi' que foi utilizada para fazer essa requisição [clique aqui](https://swapi.dev/api/).