package com.dgsaltarin.backend.web.controller;

import com.dgsaltarin.backend.domain.dto.TransactionRequest;
import com.dgsaltarin.backend.domain.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/transaction")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController {

    private TransactionsService transactionsService;

    @Autowired
    public TransactionController(TransactionsService transactionsService) {
        this.transactionsService = transactionsService;
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> addAmount(@RequestBody TransactionRequest transactionRequest) {
        return transactionsService.makeTransaction(transactionRequest).map(newBalance ->
                new ResponseEntity(newBalance, HttpStatus.ACCEPTED))
                .orElse(new ResponseEntity(HttpStatus.BAD_REQUEST));
    }

    @PostMapping("/subtract")
    public ResponseEntity<Integer> subtractAmount(TransactionRequest transactionRequest) {
        return transactionsService.makeTransaction(transactionRequest).map(newBalance ->
                new ResponseEntity(newBalance, HttpStatus.ACCEPTED))
                .orElse(new ResponseEntity(HttpStatus.BAD_REQUEST));
    }
}
