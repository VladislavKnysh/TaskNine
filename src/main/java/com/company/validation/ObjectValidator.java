package com.company.validation;

import com.company.exception.ValidationException;

public interface ObjectValidator <T> {
    public void validate(T o) throws ValidationException;
}
