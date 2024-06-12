package com.inespay.integration.models;

import java.util.List;

public class Bank {
    // Identificador del banco
    private String bankId;
    // Nombre del banco
    private String name;
    // Lista de códigos del banco
    private List<String> bankCodes;
    // País del banco
    private String country;
    // Indica si el banco está habilitado
    private Integer enabled;
    // Indica si los pagos periódicos están habilitados para el banco
    private Integer enabledPeriodicPayment;
    // Frecuencia de pagos periódicos habilitada para el banco
    private List<String> frequencyPeriodicPayment;
    // Identificador del grupo bancario
    private String bankGroupId;
    // Nombre del grupo bancario
    private String bankGroupName;

    // Constructor por defecto
    public Bank() {
    }

    // Obtiene el identificador del banco
    public String getBankId() {
        return this.bankId;
    }

    // Establece el identificador del banco
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    // Obtiene el nombre del banco
    public String getName() {
        return this.name;
    }

    // Establece el nombre del banco
    public void setName(String name) {
        this.name = name;
    }

    // Obtiene la lista de códigos del banco
    public List<String> getBankCodes() {
        return this.bankCodes;
    }

    // Establece la lista de códigos del banco
    public void setBankCodes(List<String> bankCodes) {
        this.bankCodes = bankCodes;
    }

    // Obtiene el país del banco
    public String getCountry() {
        return this.country;
    }

    // Establece el país del banco
    public void setCountry(String country) {
        this.country = country;
    }

    // Obtiene si el banco está habilitado
    public Integer getEnabled() {
        return this.enabled;
    }

    // Establece si el banco está habilitado
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    // Obtiene si los pagos periódicos están habilitados para el banco
    public Integer getEnabledPeriodicPayment() {
        return this.enabledPeriodicPayment;
    }

    // Establece si los pagos periódicos están habilitados para el banco
    public void setEnabledPeriodicPayment(Integer enabledPeriodicPayment) {
        this.enabledPeriodicPayment = enabledPeriodicPayment;
    }

    // Obtiene la frecuencia de pagos periódicos habilitada para el banco
    public List<String> getFrequencyPeriodicPayment() {
        return this.frequencyPeriodicPayment;
    }

    // Establece la frecuencia de pagos periódicos habilitada para el banco
    public void setFrequencyPeriodicPayment(List<String> frequencyPeriodicPayment) {
        this.frequencyPeriodicPayment = frequencyPeriodicPayment;
    }

    // Obtiene el identificador del grupo bancario
    public String getBankGroupId() {
        return this.bankGroupId;
    }

    // Establece el identificador del grupo bancario
    public void setBankGroupId(String bankGroupId) {
        this.bankGroupId = bankGroupId;
    }

    // Obtiene el nombre del grupo bancario
    public String getBankGroupName() {
        return this.bankGroupName;
    }

    // Establece el nombre del grupo bancario
    public void setBankGroupName(String bankGroupName) {
        this.bankGroupName = bankGroupName;
    }
}
