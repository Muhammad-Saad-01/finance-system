package io.github.thepragmaticsquad.fs.model;

import io.github.thepragmaticsquad.fs.entity.Account;
import io.github.thepragmaticsquad.fs.enums.AccountType;
import io.github.thepragmaticsquad.fs.enums.TransactionStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.sql.Date;

@Data
public class TransactionDetailedModel {
    private Long id;

    @NotNull(message = "Account is required")
    private Account account;

    @NotNull(message = "Date is required")
    @PastOrPresent(message = "Date cannot be in the future")
    private Date date;

    @NotNull(message = "Transaction type is required")
    private AccountType type;

    @NotNull(message = "Transaction status is required")
    private TransactionStatus status;

    @NotNull(message = "Amount is required")
    private Double amount;

    @NotNull(message = "Balance before transaction is required")
    private Double balanceBefore;

    @NotNull(message = "Balance after transaction is required")
    private Double balanceAfter;

    @NotBlank(message = "Details are required")
    private String details;
}
