package com.tehran.exception;

public class UserNameNotFoundException extends RuntimeException {
    private static final String MESSAGE = "Username not found";

    public UserNameNotFoundException() {
        super(MESSAGE);
    }
}
