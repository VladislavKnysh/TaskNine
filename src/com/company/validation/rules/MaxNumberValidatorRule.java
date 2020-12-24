package com.company.validation.rules;

import java.math.BigDecimal;

public class MaxNumberValidatorRule implements ValidatorRule {
    private final Number maxValue;

    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(Object value) {
        if (!CheckObjectClass(value)) {
            return false;
        } else {
            BigDecimal numberValue = new BigDecimal(value.toString());
            BigDecimal maxValueNumber = new BigDecimal(maxValue.toString());
            return  maxValueNumber.compareTo(numberValue)>=0;

        }
    }

    private boolean CheckObjectClass(Object value) {
        Class clazz = value.getClass();
        return (Number.class.isAssignableFrom(clazz));
    }

    @Override
    public String errorMessage() {
        return "You exceeded the maximum value.";
    }
}
