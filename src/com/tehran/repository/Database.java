package com.tehran.repository;

import com.tehran.model.Account;
import com.tehran.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Account> accounts;

    public Database() {
        this.accounts = new ArrayList<>();
        accounts.add(new Account("1234",
                new Person("Name", "Family", 30, "NationalCode")));
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Database setAccounts(List<Account> accounts) {
        this.accounts = accounts;
        return this;
    }
}
