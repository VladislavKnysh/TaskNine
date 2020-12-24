package com.company.validation.rules;

import java.math.BigDecimal;

public class MinNumberValidatorRule implements ValidatorRule {

    private final Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(Object value) {
        if (!CheckObjectClass(value)) {
            return false;
        } else {
            BigDecimal numberValue = new BigDecimal(value.toString());
            BigDecimal minValueNumber = new BigDecimal(minValue.toString());
            return minValueNumber.compareTo(numberValue)< 0;

        }
    }

    private boolean CheckObjectClass(Object value) {
        Class clazz = value.getClass();
        return (Number.class.isAssignableFrom(clazz));
    }

    @Override
    public String errorMessage() {
        return "Your number is lesser then minimum permitted one.";
    }
}
