package com.dgsaltarin.backend.web.controller;

import com.dgsaltarin.backend.domain.Accounts;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/account")
public class AccountController {

    @PostMapping("/")
    public void createAccount(@RequestBody Accounts accountInformation) {

    }

    @GetMapping("/:id")
    public void seeBalance(@PathVariable("id") long id) {

    }
}
