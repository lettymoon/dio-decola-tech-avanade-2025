package me.dio.decola_tech_2025.persistence.entity;

import lombok.Data;

@Data
public class CardEntity {
    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();
}