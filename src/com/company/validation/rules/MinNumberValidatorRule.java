package com.company.validation.rules;

import java.math.BigDecimal;

public class MinNumberValidatorRule implements ValidatorRule<Number>{

    private final Number minValue;

    public MinNumberValidatorRule(Number minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean validate(Number value) {
        BigDecimal numberValue = new BigDecimal(value.toString());
        BigDecimal minValueNumber = new BigDecimal(minValue.toString());
        return minValueNumber.compareTo(numberValue)< 0;
    }

    @Override
    public String errorMessage() {
        return "Your number is lesser then minimum permitted one.";
    }
}
