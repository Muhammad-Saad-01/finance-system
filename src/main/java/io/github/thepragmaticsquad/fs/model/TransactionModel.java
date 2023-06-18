package io.github.thepragmaticsquad.fs.model;

import io.github.thepragmaticsquad.fs.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.sql.Date;
@Data
public class TransactionModel {
    private Long id;

    @NotNull(message = "Transaction type is required")
    private AccountType type ;

    @NotNull(message = "Amount is required")
    private Double amount ;

    @NotNull(message = "Balance before transaction is required")
    private Double balanceBefore;

    @NotNull(message = "Balance after transaction is required")
    private Double balanceAfter;

    @NotNull(message = "Date is required")
    @PastOrPresent(message = "Date cannot be in the future")
    private Date date ;

    @NotBlank(message = "Details are required")
    private String details;
}
