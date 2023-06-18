package io.github.thepragmaticsquad.fs.service;

import io.github.thepragmaticsquad.fs.model.AccountDetailedModel;
import io.github.thepragmaticsquad.fs.model.AccountModel;
import io.github.thepragmaticsquad.fs.model.TransactionDetailedModel;

import java.util.List;

public interface AccountService {
    public AccountDetailedModel createAccount(AccountDetailedModel account);
    public AccountDetailedModel getAccountById(Long id);
    public List<AccountModel> getAllAccounts();
    public AccountDetailedModel updateAccount(AccountDetailedModel account);
    public void deleteAccount(Long id);

    public boolean isAccountActive(Long id);
    public boolean isSufficientBalance(Long id, Double amount);
    public boolean isCreditCardNumberValid(String creditNumber);
    public boolean isEmailValid(String email);
    public boolean isPhoneNumberValid(String phone);

    public void deposit(Long accountId, Double amount);
    public void withdraw(Long accountId, Double amount);
    public void transfer(Long fromAccountId, Long toAccountId, Double amount);
    public List<TransactionDetailedModel> getTransactionsByAccount(Long accountId);
}
