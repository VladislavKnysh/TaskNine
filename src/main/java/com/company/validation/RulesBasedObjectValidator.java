package com.company.validation;

import com.company.exception.ValidationException;
import com.company.validation.rules.ValidatorRule;

import java.util.List;

public class RulesBasedObjectValidator<T> implements ObjectValidator {
    List<ValidatorRule> rules;

    public RulesBasedObjectValidator(List<ValidatorRule> rules) {
        this.rules = rules;
    }

    @Override
    public void validate(Object o) throws ValidationException {
        for (ValidatorRule rule : rules) {
            if (!rule.validate(o)) {

                throw new ValidationException(rule.errorMessage());
            }
        }
    }
}

