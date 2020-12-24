package com.company.validation.rules;

public interface ValidatorRule<T> {
    boolean validate(T value);
    String errorMessage();
}
