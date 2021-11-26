package com.dgsaltarin.backend.domain;

import lombok.Data;

@Data
public class Accounts {

    private Long id;
    private double balance;
    private Users user;
    private int number;
}
