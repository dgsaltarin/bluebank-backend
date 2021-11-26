package com.dgsaltarin.backend.persistence.crud;

import com.dgsaltarin.backend.persistence.entities.TransactionsEntity;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsCrudRepository extends CrudRepository<TransactionsEntity, Integer> {
}
