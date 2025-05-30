#!/bin/bash

Write-Output "Derrubando os containers"
docker-compose down

# Apaga a pasta target
Write-Output "Limpando diretorio target..."
# rm -rf ./target
Remove-Item -Recurse -Force .\target\

# Compila o projeto
Write-Output "Gerando build com Maven..."
./mvnw clean package

# Constrói a imagem Docker
Write-Output "Construindo imagem Docker..."
docker build -t deliveries .

# Roda o container
Write-Output "Subindo container na porta 8080..."
# docker run -p 8080:8080 deliveries
docker-compose up -d --build

