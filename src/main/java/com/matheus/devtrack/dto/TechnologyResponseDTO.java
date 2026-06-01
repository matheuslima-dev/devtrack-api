package com.matheus.devtrack.dto;

public record TechnologyResponseDTO(
        Long id,
        String name,
        Integer targetHours,
        Integer studiedHours
) {
}
