package com.dgsaltarin.backend.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/transaction")
public class TransactionController {

    @PostMapping()
    public void addAmount() {

    }

    @PostMapping
    public void subtractAmount() {

    }
}
