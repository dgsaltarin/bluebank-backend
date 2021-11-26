package com.dgsaltarin.backend.persistence.crud;

import com.dgsaltarin.backend.persistence.entities.AccountsEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface AccountsCrudRepository extends CrudRepository<AccountsEntity, Integer> {

    AccountsEntity findAccountsEntitiesByNumber(int accountNumber);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("UPDATE AccountsEntity accounts SET accounts.balance =:amount WHERE accounts.number =:number")
    int update(@Param("number") int number, @Param("amount") int amount);
}
