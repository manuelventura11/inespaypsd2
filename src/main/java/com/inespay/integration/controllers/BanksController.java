package com.inespay.integration.controllers;

import com.inespay.integration.models.InespayBanksResponse;
import com.inespay.integration.services.BanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica que esta clase es un controlador REST, manejando solicitudes HTTP y devolviendo datos en formato JSON
@RestController
// Define la ruta base para todas las solicitudes manejadas por este controlador
@RequestMapping("/inespay")
public class BanksController {

    // Inyección de dependencia de la clase BanksService
    @Autowired
    public BanksService banksService;

    // Maneja las solicitudes HTTP GET en la ruta /inespay/list-banks
    @GetMapping("/list-banks")
    public InespayBanksResponse getBanks(){
        // Llama al método getBanks del servicio y devuelve la respuesta
        return banksService.getBanks();
    }
}
