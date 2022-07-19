package br.com.marcello.SimpleCrud.utils;

import br.com.marcello.SimpleCrud.dto.AccountDto;
import br.com.marcello.SimpleCrud.model.Account;

public interface AccountUtils {

    Account convertDtoToEntity(AccountDto accountDto);

}
