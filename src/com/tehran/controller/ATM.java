package com.tehran.controller;

import com.tehran.exception.UserNameNotFoundException;
import com.tehran.model.Account;
import com.tehran.repository.Database;
import com.tehran.util.Input;

public class ATM {
    private Database database;
    private Account currentAccount;


    public ATM() {
        this.database = new Database();
    }

    public void login(String accountNumber, String password) {
        currentAccount = database.getAccounts().stream().filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst().orElseThrow(() -> {
                    throw new UserNameNotFoundException();
                });
        currentAccount.validPassword(password);
    }

    private void logout() {

    }

    public void showMenu() {

    }

    public void run() {
        while (true) {
            String accountNumber = String.valueOf(Input.getInput(String.class));
            String password = String.valueOf(Input.getInput(String.class));
            login(accountNumber, password);
        }
    }
}
