package com.dgsaltarin.backend.persistence;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.Transactions;
import com.dgsaltarin.backend.persistence.crud.TransactionsCrudRepository;
import com.dgsaltarin.backend.persistence.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionsRepository {

    private TransactionsCrudRepository transactionsCrudRepository;
    private TransactionMapper transactionMapper;

    @Autowired
    public TransactionsRepository(TransactionsCrudRepository transactionsCrudRepository, TransactionMapper transactionMapper) {
        this.transactionMapper = transactionMapper;
        this.transactionsCrudRepository = transactionsCrudRepository;
    }

    public Transactions saveTransaction(Transactions transactions) {
        return transactionMapper.toTransaction(transactionsCrudRepository.save(transactionMapper.toTransactionEntity(transactions)));
    }
}
