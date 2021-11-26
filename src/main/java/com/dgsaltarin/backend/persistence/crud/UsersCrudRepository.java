package com.dgsaltarin.backend.persistence.crud;

import com.dgsaltarin.backend.persistence.entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersCrudRepository extends CrudRepository<UsersEntity, Integer> {

}
