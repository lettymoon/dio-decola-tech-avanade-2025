--liquibase formatted sql
--changeset letty:202503032340
--comment: boards table create

CREATE TABlE BOARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

--rollback DROP TABLE BOARDS