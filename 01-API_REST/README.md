# Desafio de projeto: Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +Float balance
        +Float limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +Float limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "0..n" Feature
    User "1" *-- "1" Card
    User "1" *-- "0..n" News
```

> Diagrama de classes do projeto prático da sub-trilha "Desenvolvimento de APIs com Spring Framework"

## Tecnologias utilizadas

- Java 17
- Spring Boot 3.1.2
- Spring Web
- Spring JPA
- Banco de dados H2 || PostgreSQL

## Licença

Este projeto está sob licença. Consulte [LICENSE](LICENSE) para obter mais informações.
