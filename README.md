# API de Gestão de Laboratórios

A API de Gestão de Laboratórios é um sistema desenvolvido para gerenciar informações sobre laboratórios, equipamentos e defeitos em um ambiente de laboratório.

## Funcionalidades

A API oferece as seguintes funcionalidades:

- Cadastro, atualização e exclusão de laboratórios.
- Cadastro, atualização e exclusão de equipamentos, associados a um laboratório específico.
- Registro de defeitos em equipamentos, com informações sobre descrição.

## Tecnologias utilizadas

- Java
- Spring Boot
- PostgreSQL

## Configuração do ambiente

Antes de executar a API, é necessário configurar o ambiente de desenvolvimento. Siga as etapas abaixo:

1. Certifique-se de ter o Java instalado. A versão recomendada é 17.
2. Configure um banco de dados PostgreSQL e atualize as configurações de conexão no arquivo application.yml.
3. Compile o projeto utilizando o comando `mvn clean install`.
4. Gera o jar `mvn clean packge`
5. Execute o Docker build `docker build -t gestao-laboratorio .` 
6. Execute o Docker compose `docker-compose up`

## Endpoints disponíveis

A API fornece os seguintes endpoints:

- Laboratórios:
    - GET /api/laboratory - Retorna a lista de laboratórios cadastrados.
    - GET /api/laboratory/{id} - Retorna as informações de um laboratório específico.
    - POST /api/laboratory - Cadastra um novo laboratório.
    - PUT /api/laboratory/{id} - Atualiza as informações de um laboratório específico.
    - DELETE /api/laboratory/{id} - Exclui um laboratório específico.

- Equipamentos:
    - GET /api/equipment - Retorna a lista de equipamentos cadastrados.
    - GET /api/equipment/{id} - Retorna as informações de um equipamento específico.
    - POST /api/equipment - Cadastra um novo equipamento.
    - PUT /api/equipment/{id} - Atualiza as informações de um equipamento específico.
    - DELETE /api/equipment/{id} - Exclui um equipamento específico.

- Defeitos:
    - GET /api/defect - Retorna a lista de defeitos registrados.
    - GET /api/defect/{id} - Retorna as informações de um defeito específico.
    - POST /api/defect - Registra um novo defeito.
    - PUT /api/defect/{id} - Atualiza as informações de um defeito específico.
    - DELETE /api/defect/{id} - Exclui um defeito específico.
