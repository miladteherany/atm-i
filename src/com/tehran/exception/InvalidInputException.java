package com.tehran.exception;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(Message message) {
        super(message.getMessage());
    }
}
