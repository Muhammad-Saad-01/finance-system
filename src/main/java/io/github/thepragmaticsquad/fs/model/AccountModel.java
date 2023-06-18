package io.github.thepragmaticsquad.fs.model;

import io.github.thepragmaticsquad.fs.enums.AccountType;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Date;

@Data
public class AccountModel {
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotNull(message = "Balance is required")
    @DecimalMin(value = "50", inclusive = false, message = "Balance must be greater than 0")
    private Double balance;

    @NotNull(message = "Created at date is required")
    private Date createdAt;

    private Date lastTransaction;

    @NotNull(message = "Account type is required")
    private AccountType type;

    private boolean active;
}
