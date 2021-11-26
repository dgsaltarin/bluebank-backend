package com.dgsaltarin.backend.domain.service;

import com.dgsaltarin.backend.domain.dto.TransactionRequest;
import com.dgsaltarin.backend.persistence.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService {

    private TransactionsRepository transactionsRepository;
    private AccountsService accountsService;

    @Autowired
    public TransactionsService(TransactionsRepository transactionsRepository, AccountsService accountsService) {
        this.transactionsRepository = transactionsRepository;
        this.accountsService = accountsService;
    }

    public void makeTransaction(TransactionRequest transactionRequest) {

    }
}
