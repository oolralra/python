package br.com.marcello.SimpleCrud.repository;

import br.com.marcello.SimpleCrud.model.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {

    @Query(value = "SELECT * FROM user_addresses WHERE account_id = :id", nativeQuery = true)
    List<Address> getAddressesByAccountId(@Param("id") Long id);

}
