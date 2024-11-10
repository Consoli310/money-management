Money Management API - Desenvolvimento de Aplicação de Gerenciamento de Contas

Desenvolvi uma API RESTful em Java utilizando Spring Boot, com o objetivo de gerenciar contas de usuários, incluindo funcionalidades como criação de contas, depósitos e retiradas. A aplicação utiliza o Spring Data JPA para a persistência de dados em um banco H2 (em memória), permitindo realizar operações de forma rápida e eficiente.

Funcionalidades implementadas:
Criação de contas de usuário com informações de nome, e-mail, tipo de conta e saldo inicial.
Consultas de contas por nome de usuário.
Depósitos e retiradas com validação de saldo.
Ferramentas e Tecnologias Utilizadas:
Java 17: Linguagem principal utilizada para o desenvolvimento da aplicação.
Spring Boot: Framework para desenvolvimento de microsserviços, facilitando a configuração e implementação de rotas REST.
Spring Data JPA: Para integração com banco de dados relacional, simplificando a persistência de dados.
H2 Database: Banco de dados em memória utilizado para armazenamento temporário durante o desenvolvimento.
Maven: Gerenciador de dependências e automação de build.