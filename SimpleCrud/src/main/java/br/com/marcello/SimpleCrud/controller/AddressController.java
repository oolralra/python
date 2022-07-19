package br.com.marcello.SimpleCrud.controller;

import br.com.marcello.SimpleCrud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllAddresses() {
        return new ResponseEntity<>(this.addressService.getAllAddresses(), HttpStatus.OK);
    }

    @GetMapping("/{id}/getAccountAddresses")
    public ResponseEntity<?> getAddressesByAccountId(@PathVariable Long id) {
        return new ResponseEntity<>(this.addressService.getAddressesByAccountId(id), HttpStatus.OK);
    }

}
