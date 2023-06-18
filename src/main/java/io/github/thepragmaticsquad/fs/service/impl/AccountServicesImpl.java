package io.github.thepragmaticsquad.fs.service.impl;

import io.github.thepragmaticsquad.fs.entity.Account;
import io.github.thepragmaticsquad.fs.mapper.AccountMapper;
import io.github.thepragmaticsquad.fs.model.AccountDetailedModel;
import io.github.thepragmaticsquad.fs.model.AccountModel;
import io.github.thepragmaticsquad.fs.model.TransactionDetailedModel;
import io.github.thepragmaticsquad.fs.repository.AccountRepository;
import io.github.thepragmaticsquad.fs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServicesImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDetailedModel createAccount(AccountDetailedModel account) {
        return null;
    }

    @Override
    public AccountDetailedModel getAccountById(Long id) {
        return null;
    }

    @Override
    public List<AccountModel> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .map(AccountMapper.INSTANCE::toModel)
                .toList();
    }

    @Override
    public AccountDetailedModel updateAccount(AccountDetailedModel account) {
        return null;
    }

    @Override
    public void deleteAccount(Long id) {

    }

    @Override
    public boolean isAccountActive(Long id) {
        return false;
    }

    @Override
    public boolean isSufficientBalance(Long id, Double amount) {
        return false;
    }

    @Override
    public boolean isCreditCardNumberValid(String credit_number) {
        return false;
    }

    @Override
    public boolean isEmailValid(String email) {
        return false;
    }

    @Override
    public boolean isPhoneNumberValid(String phone) {
        return false;
    }

    @Override
    public void deposit(Long accountId, Double amount) {

    }

    @Override
    public void withdraw(Long accountId, Double amount) {

    }

    @Override
    public void transfer(Long fromAccountId, Long toAccountId, Double amount) {

    }

    @Override
    public List<TransactionDetailedModel> getTransactionsByAccount(Long accountId) {
        return null;
    }
}
