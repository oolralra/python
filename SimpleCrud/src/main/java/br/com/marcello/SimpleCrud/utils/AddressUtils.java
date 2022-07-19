package br.com.marcello.SimpleCrud.utils;

import br.com.marcello.SimpleCrud.dto.AddressDto;
import br.com.marcello.SimpleCrud.model.Address;

import java.util.List;

public interface AddressUtils {

    List<Address> convertDtoToEntity(List<AddressDto> addressesDto);

}
