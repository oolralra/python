package br.com.marcello.SimpleCrud.dto;

import br.com.marcello.SimpleCrud.model.Address;
import br.com.marcello.SimpleCrud.model.enumerations.AddressType;

public class AddressDto {

    private String street;
    private Integer number;
    private String zipcode;
    private AddressType addressType;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
}
