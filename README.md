

## API - Consulta de livros - Biblioteca H2

### - Pré requisitos:
- Java 17
- Maven
- Spring boot
- Banco de dados H2


### - Como executar:

 - Instalar as dependencias com o maven:
 ```bash
mvn clean Install
```

- Executar o Spring boot
```bash
mvn clean spring-boot:run
```


## Endpoints

### - Listar todos os livros<br>
Método: GET<br>
URL: /getAllBooks<br>
Retorno:<br>
Sucesso (200): Lista de livros no formato JSON.<br>
Sem conteúdo (204): A lista de livros está vazia.<br>
Erro interno do servidor (500): Ocorreu um erro inesperado.


### - Buscar livro por ID<br>
Método: GET<br>
URL: /getBookById/{id}<br>
Parâmetros:<br>
{id}: Identificador único do livro (Long).<br>
Retorno:<br>
Sucesso (200): Objeto livro no formato JSON.<br>
Não encontrado (404): O livro com o ID especificado não existe.


### - Adicionar novo livro<br>
Método: POST<br>
URL: /addBook<br>
Corpo da requisição: Objeto livro no formato JSON.<br>
Retorno:<br>
Sucesso (200): Objeto livro recém-criado no formato JSON.


### - Atualizar livro por ID<br>
Método: POST<br>
URL: /updateBookById/{id}<br>
Parâmetros:<br>
{id}: Identificador único do livro (Long).<br>
Corpo da requisição: Objeto livro com novos dados no formato JSON.<br>
Retorno:<br>
Sucesso (200): Objeto livro atualizado no formato JSON.<br>
Não encontrado (404): O livro com o ID especificado não existe.


### - Buscar livros por título<br>
Método: GET<br>
URL: /getBookByTitle/{title}<br>
Parâmetros:<br>
{title}: Título do livro (String).<br>
Retorno:<br>
Sucesso (200): Lista de objetos livro (opcional) no formato JSON.<br>
Não encontrado (404): Nenhum livro com o título especificado foi encontrado.<br>


### - Buscar livros por autor<br>
Método: GET<br>
URL: /getBookByAuthor/{author}<br>
Parâmetros:<br>
{author}: Nome do autor (String).<br>
Retorno:<br>
Sucesso (200): Lista de objetos livro (opcional) no formato JSON.<br>
Não encontrado (404): Nenhum livro do autor especificado foi encontrado.


### - Deletar livro por ID<br>
Método: DELETE<br>
URL: /deleteBookById/{id}<br>
Parâmetros:<br>
{id}: Identificador único do livro (Long).<br>
Retorno:<br>
Sucesso (200): Sem conteúdo.<br>
