package br.com.marcello.SimpleCrud.repository;

import br.com.marcello.SimpleCrud.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
