package com.dgsaltarin.backend.domain;

import lombok.Data;

@Data
public class Accounts {

    private Long id;
    private int balance;
    private Users user;
    private int number;
}
