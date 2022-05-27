package com.tehran.model;

import java.time.LocalDateTime;

public abstract class Transaction {
    protected Double amount;
    protected LocalDateTime createdDate;
    protected Account account;
    protected TransactionStatus transactionStatus;

    public abstract void operate();
}
