package me.dio.decola_tech_2025.dto;

import me.dio.decola_tech_2025.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
}