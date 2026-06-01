package com.matheus.devtrack.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record TechnologyRequestDTO(

        @NotBlank
        String name,

        @Min(1)
        Integer targetHours,

        @Min(0)
        Integer studiedHours
) {
}
