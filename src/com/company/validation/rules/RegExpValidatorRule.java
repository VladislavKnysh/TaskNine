package com.company.validation.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorRule implements ValidatorRule {

    private final Pattern pattern;

    public RegExpValidatorRule(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean validate(Object value) {
        CharSequence charSequence = (CharSequence) value;
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.matches();
    }

    @Override
    public String errorMessage() {
        return "Your message failed verification.";
    }
}
