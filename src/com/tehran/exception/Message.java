package com.tehran.exception;

public enum Message {
    INVALID_AGE("Wrong age input!"),
    INVALID_NATIONAL_CODE("Wrong national code input!"),
    INVALID_AMOUNT("Invalid Amount");


    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

