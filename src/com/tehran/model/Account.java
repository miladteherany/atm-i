package com.tehran.model;

import com.tehran.exception.BadCredentialException;
import com.tehran.exception.InvalidInputException;
import com.tehran.exception.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Account {

    private static final Double MIN_BALANCE = 100D;
    private String accountNumber;
    private String password;
    private Double balance;
    private Person person;
    private List<Transaction> transactions;

    public Account(String password, Person person) {
        this.accountNumber = String.valueOf(new Random().nextInt(5000));
        this.password = password;
        this.balance = MIN_BALANCE;
        this.person = person;
    }

    public void validPassword(String password) {
        if (!password.equals(this.password)) {
            throw new BadCredentialException();
        }
    }

    public String printAccountDetails() {
        return "Account Number: " + accountNumber +
                "Full Name: " + person.getFullName() +
                "National Code: " + person.getNationalCode() +
                "Balance: " + balance;
    }

    public void withdraw(Double amount) {
        if (this.balance - amount < MIN_BALANCE) {
            throw new InvalidInputException(Message.INVALID_AMOUNT);
        }
        this.balance -= amount;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        if (Objects.isNull(transactions)) {
            transactions = new ArrayList<>();
        }
        transactions.add(transaction);
    }
}
