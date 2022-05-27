package com.tehran.model;

import com.tehran.exception.InvalidInputException;
import com.tehran.exception.Message;

public class Person {
    private String name;
    private String familyName;
    private Integer age;
    private String nationalCode;

    public Person(String name, String familyName, Integer age, String nationalCode) {
        validateInput(age, nationalCode);
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.nationalCode = nationalCode;
    }

    private void validateInput(Integer age, String nationalCode) {
        if (age < 18) {
            throw new InvalidInputException(Message.INVALID_AGE);
        }
        if (nationalCode.length() != 10) {
            throw new InvalidInputException(Message.INVALID_NATIONAL_CODE);
        }
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getFullName() {
        return name + " " + familyName;
    }
}
