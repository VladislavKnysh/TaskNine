package com.company.validation.rules;

import java.math.BigDecimal;

public class MaxNumberValidatorRule implements ValidatorRule<Number> {
    private final Number maxValue;

    public MaxNumberValidatorRule(Number maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean validate(Number value) {
        BigDecimal numberValue = new BigDecimal(value.toString());
        BigDecimal maxValueNumber = new BigDecimal(maxValue.toString());
        return  maxValueNumber.compareTo(numberValue)>=0;    }

    @Override
    public String errorMessage() {
        return "You exceeded the maximum value.";
    }
}
