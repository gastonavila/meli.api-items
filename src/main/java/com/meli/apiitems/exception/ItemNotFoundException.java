package com.meli.apiitems.exception;

/**
 * Excepción personalizada lanzada cuando no se encuentra un ítem con el ID dado.
 * 
 * Esta excepción se lanza cuando se intenta recuperar un ítem que no existe
 * en la base de datos. El mensaje contiene información correspondiente al error.
 */
public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}