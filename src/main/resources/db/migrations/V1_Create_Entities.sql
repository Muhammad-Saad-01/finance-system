CREATE SEQUENCE accounts_id_seq;

CREATE TABLE IF NOT EXISTS accounts
(
    id               INT          NOT NULL PRIMARY KEY DEFAULT nextval('accounts_id_seq'),
    username         VARCHAR(255) NOT NULL UNIQUE,
    password         VARCHAR(255) NOT NULL CHECK ( LENGTH(password) >= 8 ),
    email            VARCHAR(255) NOT NULL UNIQUE, -- TODO: add email validation
    phone            VARCHAR(255) NOT NULL UNIQUE, -- TODO: add phone validation
    created_at       TIMESTAMP                         DEFAULT CURRENT_TIMESTAMP,
    credit_number    VARCHAR(255),
    balance          DECIMAL                           DEFAULT 0,
    last_transaction DATE,
    account_type     VARCHAR(255)                      DEFAULT 'STANDARD',
    active           BOOLEAN                           DEFAULT TRUE
);

ALTER SEQUENCE accounts_id_seq OWNED BY accounts.id;

CREATE SEQUENCE transactions_id_seq;

CREATE TABLE IF NOT EXISTS transactions
(
    id               INT          NOT NULL PRIMARY KEY DEFAULT nextval('transactions_id_seq'),
    account_id       INT          NOT NULL REFERENCES accounts (id),
    status           VARCHAR(255) NOT NULL check ( status in ('PENDING', 'SUCCESS', 'FAILED') ),
    transaction_type VARCHAR(255) NOT NULL check ( transaction_type in ('DEPOSIT', 'WITHDRAWAL', 'TRANSFER') ),
    amount           DECIMAL      NOT NULL,
    transaction_date TIMESTAMP                         DEFAULT CURRENT_TIMESTAMP,
    description      VARCHAR(255) NOT NULL,
    balance_before   DECIMAL,
    balance_after    DECIMAL,
    details          VARCHAR(255)
);

ALTER SEQUENCE transactions_id_seq OWNED BY transactions.id;