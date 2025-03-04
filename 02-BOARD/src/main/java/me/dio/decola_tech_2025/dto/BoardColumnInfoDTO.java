package me.dio.decola_tech_2025.dto;

import me.dio.decola_tech_2025.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}