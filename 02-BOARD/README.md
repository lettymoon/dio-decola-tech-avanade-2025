# Desafio de projeto: Criando seu Board de Tarefas com Java

![image](https://github.com/user-attachments/assets/8193da28-597e-46d3-b115-b24ee5859420)

> Diagrama Entidade-Relacionamento do projeto prático da sub-trilha "Integração de Sistemas com Banco de Dados"

## Tecnologias utilizadas

- Java 17
- Docker (Para utilizar o MySQL)
- Spring Boot 3.4.3
- Liquibase 4.29.1
- H2 2.2.24
- Lombok 1.18.34

## Observações importantes

- O projeto idealmente deveria ter um frontend por se tratar de um `Board Kanban` (Jira, Trello, etc). Porém, a fim de simplicidade será feito utilizando terminal
  - O uso do I/O do terminal juntamente dos logs sincronos do `liquibase` criam um conflito e é necessário criar uma [config Migration diferente](./src/main/java/me/dio/decola_tech_2025/persistence/migration/MigrationStrategy.java) para lidar com o caso.  

## Executando o projeto

É necessário ter uma instância do MySQL rodando, para isso, tendo o Docker instalado, execute:

```bash
docker run --name mysql-local -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=board -e MYSQL_USER=board -e MYSQL_PASSWORD=board -p 3306:3306 -d mysql:8
```

Isso criará um container chamado `mysql-local` rodando o MySQL 8, com o banco board e as credenciais:

- Usuário: board
- Senha: board
- Root Password: root
- Porta: 3306

Para encerrar a instância deste container docker, execute:

```bash
docker rm -f mysql-local
```

Com o Container docker em execução, você pode iniciar o projeto e ser feliz!

## Licença

Este projeto está sob licença. Consulte [LICENSE](../LICENSE) para obter mais informações.
