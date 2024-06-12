package com.inespay.integration.services;

import com.inespay.integration.models.InespayBanksResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

// Indica que esta clase es un servicio, un componente de la lógica de negocio de la aplicación
@Service
public class BanksService {
    // Cliente WebClient para realizar solicitudes HTTP
    private final WebClient webClient;

    // URI base para la API de Inespay, obtenida desde la configuración
    @Value("${url.api.inespay.getBanks}")
    private String inespayUri;

    // Token de autenticación, obtenido desde la configuración
    @Value("${api.token}")
    private String apiToken;

    // Clave de la API, obtenida desde la configuración
    @Value("${api.key}")
    private String apiKey;

    // Constructor que construye el WebClient con la URI base de Inespay
    public BanksService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(inespayUri).build();
    }

    // Método para obtener la lista de bancos desde la API de Inespay
    public InespayBanksResponse getBanks() {
        // Realiza una solicitud GET a la URI de Inespay con los encabezados necesarios y bloquea hasta recibir la respuesta
        InespayBanksResponse response = this.webClient.get()
                .uri(inespayUri)
                .header("X-Api-Key", apiKey)
                .header("Authorization", apiToken)
                .header("Content-Type", "application/json")
                .retrieve()
                .bodyToMono(InespayBanksResponse.class)
                .block();
        return response;
    }
}

