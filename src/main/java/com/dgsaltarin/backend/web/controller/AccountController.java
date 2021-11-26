package com.dgsaltarin.backend.web.controller;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.dto.CreateAccountRequest;
import com.dgsaltarin.backend.domain.dto.CreatedAccountResponse;
import com.dgsaltarin.backend.domain.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    private AccountsService accountsService;

    @Autowired
    public AccountController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @PostMapping("")
    public ResponseEntity<Accounts> createAccount(@RequestBody CreateAccountRequest createAccountRequest) {
        return accountsService.createAccount(createAccountRequest).map(account ->
            new ResponseEntity<>(account, HttpStatus.CREATED)
        ).orElse(new ResponseEntity<>(HttpStatus.BAD_REQUEST));
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<Integer> seeBalance(@PathVariable("accountNumber") int accountNumber) {
        return accountsService.consultBalance(accountNumber).map(balance -> new ResponseEntity<>(balance, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
