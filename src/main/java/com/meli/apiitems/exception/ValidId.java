package com.meli.apiitems.exception;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotación personalizada para validar el formato del ID de un ítem.
 * 
 * Esta anotación se aplica a los parámetros o campos que necesitan ser validados según un
 * patrón específico (en este caso, el formato del ID). La anotación delega la validación a la 
 * clase `IdValidator`, que contiene la lógica de validación real.
 */
@Constraint(validatedBy = IdValidator.class) // Asegúrate de tener un IdValidator
@Target({ ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidId {
    /**
     * Mensaje que se muestra cuando el ID no cumple con el formato correcto.
     * 
     * Este mensaje es personalizado y puede ser modificado.
     * 
     * @return El mensaje de error que se muestra si el ID no es válido.
     */
    String message() default "El ID ingresado posee el formato incorrecto";
    
    /**
     * Grupos de validación. Se utiliza para agrupar diferentes tipos de validación, 
     * pero no es necesario en este caso.
     * 
     * @return Un arreglo de grupos de validación.
     */
    Class<?>[] groups() default {};
    
    /**
     * Carga útil para la validación. Se utiliza para asociar metadatos adicionales con la validación,
     * pero no es necesario en este caso.
     * 
     * @return Un arreglo de clases `Payload` para asociar datos adicionales con la validación.
     */
    Class<? extends Payload>[] payload() default {};
}
