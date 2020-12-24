package com.company.validation.rules;

import java.util.Objects;

public class StartsWithValidatorRule implements ValidatorRule {

    private final String start;

    public StartsWithValidatorRule(String start) {
        this.start = start;
    }

    @Override
    public boolean validate(Object value) {

        String stringValue = (String) value;

        return stringValue.startsWith(start);
    }

    @Override
    public String errorMessage() {
        return "Your string does not starts with needed sequence.";
    }
}
