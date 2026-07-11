package com.example.account.controller;

import com.example.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccount() {

        return new Account(
                101,
                "Nainammal",
                50000
        );
    }
}
