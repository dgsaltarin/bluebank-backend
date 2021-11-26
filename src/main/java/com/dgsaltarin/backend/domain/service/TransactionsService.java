package com.dgsaltarin.backend.domain.service;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.Transactions;
import com.dgsaltarin.backend.domain.dto.TransactionRequest;
import com.dgsaltarin.backend.persistence.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TransactionsService {

    private TransactionsRepository transactionsRepository;
    private AccountsService accountsService;

    @Autowired
    public TransactionsService(TransactionsRepository transactionsRepository, AccountsService accountsService) {
        this.transactionsRepository = transactionsRepository;
        this.accountsService = accountsService;
    }

    public Optional<Integer> makeTransaction(TransactionRequest transactionRequest) {
        Transactions transaction = new Transactions();
        transaction.setAmount(transactionRequest.getAmount());
        transaction.setOperation(transactionRequest.getOperation());
        transaction.setDate(LocalDate.now());
        transaction.setAccount(accountsService.getByNumber(transactionRequest.getAccountNumber()).get());
        transactionsRepository.saveTransaction(transaction);
        if (transactionRequest.getOperation().equals("ADD")) {
            return accountsService.updateBalance(transactionRequest.getAccountNumber(), transactionRequest.getAmount());
        } else {
            return accountsService.updateBalance(transactionRequest.getAccountNumber(), -transactionRequest.getAmount());
        }
    }
}
