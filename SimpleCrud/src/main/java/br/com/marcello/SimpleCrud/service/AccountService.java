package br.com.marcello.SimpleCrud.service;

import br.com.marcello.SimpleCrud.dto.UpdateUsernameDto;
import br.com.marcello.SimpleCrud.model.Account;

public interface AccountService {

    Account saveAccount(Account account);

    Account findById(Long id);

    void deleteAccount(Long id);

    Account updateUsername(Long id, UpdateUsernameDto updateUsernameDto);

}
