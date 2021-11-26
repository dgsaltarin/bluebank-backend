package com.dgsaltarin.backend.web.controller;

import com.dgsaltarin.backend.domain.dto.TransactionRequest;
import com.dgsaltarin.backend.domain.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/transaction")
public class TransactionController {

    private TransactionsService transactionsService;

    @Autowired
    public TransactionController(TransactionsService transactionsService) {
        this.transactionsService = transactionsService;
    }

    @PostMapping()
    public void addAmount(TransactionRequest transactionRequest) {

    }

    @PostMapping
    public void subtractAmount(TransactionRequest transactionRequest) {

    }
}
