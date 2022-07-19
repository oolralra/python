package br.com.marcello.SimpleCrud.service;

import br.com.marcello.SimpleCrud.model.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressService {

    List<Address> getAllAddresses();

    List<Address> getAddressesByAccountId(@Param("id") Long id);

}
