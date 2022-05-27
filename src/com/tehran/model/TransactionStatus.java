package com.tehran.model;

public enum TransactionStatus {
    COMPLETE(1),
    IN_PROGRESS(2),
    FAILED(3);

    private Integer value;

    TransactionStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
