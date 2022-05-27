package com.tehran.exception;

public class BadCredentialException extends RuntimeException {
    private static final String MESSAGE = "Wrong Password";

    public BadCredentialException() {
        super(MESSAGE);
    }
}
