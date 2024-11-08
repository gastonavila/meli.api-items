package com.meli.apiitems.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.HandlerMethodValidationException;

/**
 * Manejador global de excepciones.
 * Esta clase maneja todas las excepciones que se producen en la aplicación.
 * Usa la anotación `@RestControllerAdvice` para manejar excepciones de manera global para 
 * los controladores REST. Se utiliza con el fin de proporcionar una respuesta adecuada según el tipo de
 * excepción que ocurra.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Maneja las excepciones de validación.
     * Cuando ocurre una excepción de validación en un parámetro de la API, este método
     * devuelve una respuesta HTTP 400 (BAD REQUEST) con un mensaje claro sobre el error de validación.
     *
     * @param ex La excepción de validación que contiene detalles sobre el error.
     * @return Una respuesta con un mensaje de error de validación.
     */
    @ExceptionHandler(HandlerMethodValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<String> handleValidationExceptions(HandlerMethodValidationException ex) {
        String message = "Error de validación: El ID debe tener el formato correcto";
        return ResponseEntity.badRequest().body(message);
    }
    
    /**
     * Maneja la excepción personalizada `ItemNotFoundException`.
     * Este método captura la excepción cuando un ítem no se encuentra en la base de datos
     * y devuelve una respuesta HTTP 404 (NOT FOUND) con el mensaje del error.
     * @param ex La excepción `ItemNotFoundException` que contiene el mensaje de error.
     * @return El mensaje de error relacionado con la excepción `ItemNotFoundException`.
     */
    @ExceptionHandler(ItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String handleItemNotFound(ItemNotFoundException ex) {
        return ex.getMessage();
    }
}

