package io.github.thepragmaticsquad.fs.model;

import io.github.thepragmaticsquad.fs.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class TransactionModel {
    private Long id;

    @NotNull(message = "Transaction type is required")
    private AccountType type ;

    @NotNull(message = "Amount is required")
    private BigDecimal amount ;

    @NotNull(message = "Balance before transaction is required")
    private BigDecimal balanceBefore;

    @NotNull(message = "Balance after transaction is required")
    private BigDecimal balanceAfter;

    @NotNull(message = "Date is required")
    @PastOrPresent(message = "Date cannot be in the future")
    private LocalDateTime date ;

    @NotBlank(message = "Details are required")
    private String details;
}
