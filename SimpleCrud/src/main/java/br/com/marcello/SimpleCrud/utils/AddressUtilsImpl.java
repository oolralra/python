package br.com.marcello.SimpleCrud.utils;

import br.com.marcello.SimpleCrud.dto.AddressDto;
import br.com.marcello.SimpleCrud.model.Address;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressUtilsImpl implements AddressUtils{

    @Override
    public List<Address> convertDtoToEntity(List<AddressDto> addressesDto) {
        List<Address> addresses = new ArrayList<>();
        for(AddressDto addressDto : addressesDto) {
            Address address = new Address();
            address.setStreet(addressDto.getStreet());
            address.setNumber(addressDto.getNumber());
            address.setZipcode(addressDto.getZipcode());
            address.setAddressType(addressDto.getAddressType());
            addresses.add(address);
        }

        return addresses;
    }

}
