package com.meli.apiitems.controller;

import com.meli.apiitems.model.Item;
import com.meli.apiitems.service.ItemService;
import com.meli.apiitems.dto.ItemDTO;
import com.meli.apiitems.exception.ValidId;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para gestionar los ítems.
 * 
 * Esta clase es responsable de exponer los endpoints relacionados con la 
 * gestión de ítems. Los endpoints permiten la recuperación de un ítem 
 * específico por su ID.
 */
@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * Endpoint para obtener un ítem por su ID.
     * 
     * Este endpoint permite recuperar un ítem completo (con todos sus detalles)
     * a partir de su ID único. Si el ítem no existe, se lanza una excepción
     * que será manejada adecuadamente para retornar un mensaje de error.
     * 
     * @param id El ID del ítem que se desea recuperar. El formato del ID debe seguir
     *           la expresión regular definida en la entidad `Item`.
     * @return Un objeto `Item` que contiene los detalles del ítem solicitado.
     * @throws ItemNotFoundException Si el ítem no existe en la base de datos.
     */
    @Operation(summary = "Item por ID", description = "Recupera un item específico según su ID con el cuerpo completo")
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable @ValidId String id) {
        return ResponseEntity.ok(itemService.findById(id));
    }
    
}
