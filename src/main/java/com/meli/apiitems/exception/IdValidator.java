package com.meli.apiitems.exception;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validador de formato para el ID de un ítem.
 * 
 * Esta clase implementa la interfaz `ConstraintValidator` y contiene la lógica para validar
 * que el ID de un ítem tenga el formato correcto. Se usa en combinación con la anotación
 * `ValidId` para validar los IDs en la aplicación.
 */
public class IdValidator implements ConstraintValidator<ValidId, String> {
    
    /**
     * Método que valida si un ID cumple con el formato requerido.
     * 
     * El ID debe tener un formato específico: 3 letras mayúsculas seguidas por
     * 36 caracteres alfanuméricos o guiones. Este método utiliza una expresión regular
     * para verificar el formato.
     * 
     * @param id El ID que se va a validar.
     * @param context El contexto de validación que contiene información adicional.
     * @return `true` si el ID es válido, `false` si no lo es.
     */
    @Override
    public boolean isValid(String id, ConstraintValidatorContext context) {
        return id != null && id.matches("^[A-Z]{3}[\\w-]{36}$");
    }
}

