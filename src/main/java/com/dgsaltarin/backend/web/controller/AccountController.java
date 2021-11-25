package com.dgsaltarin.backend.web.controller;

import com.dgsaltarin.backend.domain.Accounts;
import com.dgsaltarin.backend.domain.dto.CreateAccountRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/account")
public class AccountController {

    @PostMapping("/")
    public ResponseEntity<CreateAccountRequest> createAccount(@RequestBody CreateAccountRequest createAccountRequest) {
        return new ResponseEntity<CreateAccountRequest>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/:id")
    public void seeBalance(@PathVariable("id") long id) {

    }
}
