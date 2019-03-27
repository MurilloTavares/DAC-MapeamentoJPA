# Construindo imagem do banco
docker build -t murillo/banco ./banco

# Iniciando banco
docker run -p 5433:5432 --name banco -d murillo/banco

# Limpando e construindo o projeto
mvn clean compile assembly:single

# Construingo imagem da aplicacao
docker build -t murillo/app .

# Iniciando aplicacao linkada com o banco
docker run --name app --link banco:hostbanco -d murillo/app
