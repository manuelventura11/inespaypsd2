package com.inespay.integration.models;

import java.util.List;

public class InespayBanksResponse {
    // Estado de la respuesta
    private String status;
    // Descripción de la respuesta
    private String description;
    // Total de bancos devueltos en la respuesta
    private Integer total;
    // Lista de objetos Bank devueltos en la respuesta
    private List<Bank> data;

    // Constructor por defecto
    public InespayBanksResponse() {
    }

    // Obtiene el estado de la respuesta
    public String getStatus() {
        return this.status;
    }

    // Establece el estado de la respuesta
    public void setStatus(String status) {
        this.status = status;
    }

    // Obtiene la descripción de la respuesta
    public String getDescription() {
        return this.description;
    }

    // Establece la descripción de la respuesta
    public void setDescription(String description) {
        this.description = description;
    }

    // Obtiene el total de bancos devueltos
    public Integer getTotal() {
        return this.total;
    }

    // Establece el total de bancos devueltos
    public void setTotal(Integer total) {
        this.total = total;
    }

    // Obtiene la lista de bancos
    public List<Bank> getData() {
        return this.data;
    }

    // Establece la lista de bancos
    public void setData(List<Bank> data) {
        this.data = data;
    }
}

