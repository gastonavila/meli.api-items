package com.meli.apiitems.repository;


import com.meli.apiitems.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para la entidad `Item`.
 * 
 * Este repositorio extiende `JpaRepository`, proporcionando métodos para interactuar
 * con la base de datos. Gracias a JPA, se pueden realizar operaciones CRUD (crear, 
 * leer, actualizar, eliminar) sin necesidad de escribir consultas SQL explícitas.
 */
public interface ItemRepository extends JpaRepository<Item, String> {
}
