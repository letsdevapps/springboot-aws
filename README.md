# Springboot AWS

![GitHub last commit](https://img.shields.io/github/last-commit/letsdevapps/springboot-aws)

![Java](https://img.shields.io/badge/java-21+-brightgreen)
![Springboot](https://img.shields.io/badge/springboot-3+-brightgreen)

![Status](https://img.shields.io/badge/status-active-success)

## Configure Auth

Desde 2026, Localstack necessita criar acesso pelo site https://localstack.cloud

Instalar cli na sua maquina

    npm install -g @localstack/lstk

    lstk login

Voce recebe um link e um codigo temporario

    lstk start
    
Selecione qual emulador vai usar, AWS

    lstk status

    lstk stop

## Docker
## AWS (Localstack)

**Descontinuado**, agora usa-se **lstk** para gerir o container, ele ainda usa docker por baixo dos panos porem administração mudou para o cli.

    docker run --rm -it -p 4566:4566 localstack/localstack

### S3

Create

    aws --endpoint-url=http://localhost:4566 s3 mb s3://bucket-1

List

    aws --endpoint-url=http://localhost:4566 s3 ls

## API Endpoints

Home API index

	GET /api
	----- Springboot AWS | Home Api | Index -----
