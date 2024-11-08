package com.meli.apiitems.service;

import com.meli.apiitems.model.Item;
import com.meli.apiitems.repository.ItemRepository;
import com.meli.apiitems.exception.ItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio para la lógica de negocio relacionada con los ítems.
 * 
 * Esta clase contiene la lógica para gestionar los ítems, como la búsqueda de un ítem
 * por su ID. Si un ítem no se encuentra, lanza una excepción personalizada.
 */
@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    /**
     * Recupera un ítem por su ID.
     * 
     * Este método busca un ítem en la base de datos utilizando su ID. Si el ítem
     * no se encuentra, se lanza una excepción `ItemNotFoundException`.
     *
     * @param id El ID del ítem a recuperar.
     * @return El ítem correspondiente al ID proporcionado.
     * @throws ItemNotFoundException Si no se encuentra un ítem con el ID especificado.
     */
    public Item findById(String id) {
        return itemRepository.findById(id).orElseThrow(() -> new ItemNotFoundException("El item con el ID " + id + " no existe."));
    }
}

