package com.meli.apiitems.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ItemDTO {
    
    @NotBlank(message = "El título no puede estar vacío.")
    @Size(max = 255, message = "El título no puede exceder los 255 caracteres.")
    private String title;
    
    @NotNull(message = "El precio no puede ser nulo.")
    @Positive(message = "El precio debe ser un número positivo.")
    private double price;
    
    @NotBlank(message = "La descripción no puede estar vacía.")
    private String description;
    
    @NotBlank(message = "El siteId no puede estar vacío.")
    private String siteId; // Necesario para generar el ID
}
