package br.com.marcello.SimpleCrud.service;

import br.com.marcello.SimpleCrud.model.Address;
import br.com.marcello.SimpleCrud.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
       return (List<Address>) this.addressRepository.findAll();
    }

    @Override
    public List<Address> getAddressesByAccountId(Long id) {
        return this.addressRepository.getAddressesByAccountId(id);
    }
}
