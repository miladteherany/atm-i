package com.tehran.model;

import java.time.LocalDateTime;

public class WithdrawTransaction extends Transaction {
    @Override
    public void operate() {
        createdDate = LocalDateTime.now();
        transactionStatus = TransactionStatus.COMPLETE;
        try {
            this.account.withdraw(amount);
        } catch (Exception exception) {
            exception.printStackTrace();
            transactionStatus = TransactionStatus.FAILED;
        }
        account.addTransaction(this);
    }
}
