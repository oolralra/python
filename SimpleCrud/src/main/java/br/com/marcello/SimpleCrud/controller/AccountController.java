package br.com.marcello.SimpleCrud.controller;

import br.com.marcello.SimpleCrud.dto.AccountDto;
import br.com.marcello.SimpleCrud.dto.UpdateUsernameDto;
import br.com.marcello.SimpleCrud.model.Account;
import br.com.marcello.SimpleCrud.service.AccountService;
import br.com.marcello.SimpleCrud.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountUtils accountUtils;

    @PostMapping("/add")
    public ResponseEntity<?> addAccount(@RequestBody AccountDto accountDto) {
        Account account = this.accountUtils.convertDtoToEntity(accountDto);

        return new ResponseEntity<>(this.accountService.saveAccount(account), HttpStatus.OK);
    }

    @GetMapping("/{id}/get")
    public ResponseEntity<?> getAccount(@PathVariable Long id) {
        return new ResponseEntity<>(this.accountService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteAccount(@PathVariable Long id) {
        this.accountService.deleteAccount(id);
    }

    @PatchMapping("/{id}/updateUsername")
    public ResponseEntity<?> updateUsername(@PathVariable Long id, @RequestBody UpdateUsernameDto updateUsernameDto) {
        return new ResponseEntity<>(this.accountService.updateUsername(id, updateUsernameDto), HttpStatus.OK);
    }

}
