package com.meli.apiitems.model;
import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 * Entidad que representa un ítem en el sistema.
 * 
 * Esta clase mapea los datos de un ítem almacenados en la base de datos a un objeto Java.
 * La clase contiene las propiedades del ítem y está anotada con las anotaciones de JPA 
 * para la persistencia en la base de datos.
 */
@Data
@Entity
@Table(name="items")
public class Item implements Serializable{
    
    /**
     * Identificador único del ítem.
     * 
     * Este campo se utiliza como clave primaria en la tabla de la base de datos.
     * El ID debe seguir un formato específico: 3 letras mayúsculas seguidas por
     * 36 caracteres alfanuméricos o guiones bajos.
     */
    @Id
    @NotNull(message = "El ID no puede ser nulo.")
    @Pattern(regexp = "^[A-Z]{3}[\\w-]{36}$", message = "El ID debe tener el formato correcto")
    private String id;

    /**
     * Título del ítem.
     * Este campo almacena el nombre o título descriptivo del ítem.
     */
    private String title;
    /**
     * Precio del ítem.
     * Este campo almacena el precio del ítem en formato numérico.
     */
    private Double price;
    /**
     * ID del sitio donde se ofrece el ítem.
     * Este campo almacena el identificador del sitio web o plataforma que ofrece
     * el ítem.
     */
    private String siteId;
    /**
     * Descripción del ítem.
     * Este campo almacena una descripción detallada del ítem.
     */
    private String description;

}
