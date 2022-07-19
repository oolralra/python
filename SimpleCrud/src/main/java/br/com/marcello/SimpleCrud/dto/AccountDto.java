package br.com.marcello.SimpleCrud.dto;

import br.com.marcello.SimpleCrud.model.Address;

import java.util.List;

public class AccountDto {

    private String username;
    private String email;
    private String password;
    private List<AddressDto> addresses;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AddressDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDto> addresses) {
        this.addresses = addresses;
    }
}
