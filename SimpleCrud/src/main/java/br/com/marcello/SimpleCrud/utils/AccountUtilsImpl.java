package br.com.marcello.SimpleCrud.utils;

import br.com.marcello.SimpleCrud.dto.AccountDto;
import br.com.marcello.SimpleCrud.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountUtilsImpl implements AccountUtils {

    @Autowired
    private AddressUtils addressUtils;

    @Override
    public Account convertDtoToEntity(AccountDto accountDto) {
        Account account = new Account();
        account.setUsername(accountDto.getUsername());
        account.setEmail(accountDto.getEmail());
        account.setPassword(accountDto.getPassword());
        account.setAddresses(this.addressUtils.convertDtoToEntity(accountDto.getAddresses()));
        account.getAddresses().forEach(address -> address.setAccount(account));

        return account;
    }
}
