package com.matheus.devtrack.dto;

import java.util.List;

public record ErrorResponseDTO(
        String message,
        List<String> errors
) {
}
