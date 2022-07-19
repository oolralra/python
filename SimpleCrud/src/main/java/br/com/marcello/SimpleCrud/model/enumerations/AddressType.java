package br.com.marcello.SimpleCrud.model.enumerations;

public enum AddressType {
    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial");

    private String type;

    AddressType(String type) {
        this.type = type;
    }
}
