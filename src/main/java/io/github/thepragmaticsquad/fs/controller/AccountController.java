package io.github.thepragmaticsquad.fs.controller;

import io.github.thepragmaticsquad.fs.model.AccountModel;
import io.github.thepragmaticsquad.fs.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<AccountModel> getAllAccounts(){
        return accountService.getAllAccounts();
    }
}
