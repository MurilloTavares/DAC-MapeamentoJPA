## DAC-MapeamentoJPA
Atividade acadêmica sobre Mapeamento Objeto-Relacional utilizando JPA.

### Executando através do Docker
Dentro da pasta de um dos Cenários: <br/>
``` sh run.sh ```

Acessando o banco de dados: <br/>
``` docker exec -it banco psql -U postgres database ```

Executando comandos dentro do banco:
Listar tabelas: ``` \dt ``` <br>
Exibir dados da tabela: ``` select * from <tabela> ``` <br>
Sair do banco: ``` \q ```

### Encerrando aplicação
``` sh kill.sh ```

### Importante ###
Certifique-se de encerrar a aplicação com ``` sh kill.sh ``` antes de executar um novo cenário,
já que os 3 cenários são construidos com o mesmo nome de imagem ```murillo/banco``` e ```murillo/app```
e executados com o mesmo nome ```banco``` e ```app```
