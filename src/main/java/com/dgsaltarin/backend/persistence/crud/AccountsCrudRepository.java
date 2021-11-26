package com.dgsaltarin.backend.persistence.crud;

import com.dgsaltarin.backend.persistence.entities.AccountsEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountsCrudRepository extends CrudRepository<AccountsEntity, Integer> {

}
