package br.com.marcello.SimpleCrud.service;

import br.com.marcello.SimpleCrud.dto.UpdateUsernameDto;
import br.com.marcello.SimpleCrud.model.Account;
import br.com.marcello.SimpleCrud.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return this.accountRepository.save(account);
    }

    @Override
    public Account findById(Long id) {
        return this.accountRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAccount(Long id) {
        this.accountRepository.deleteById(id);
    }

    @Override
    public Account updateUsername(Long id, UpdateUsernameDto updateUsernameDto) {
        Account account = this.findById(id);
        account.setUsername(updateUsernameDto.getNewUsername());

        return this.accountRepository.save(account);
    }
}
