package com.company;

import com.company.exception.ValidationException;
import com.company.validation.ObjectValidator;
import com.company.validation.RulesBasedObjectValidator;
import com.company.validation.rules.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<ValidatorRule> rules = new ArrayList<>();
        rules.add(new RegExpValidatorRule(Pattern.compile("\\+\\d{12}")));
        rules.add(new StartsWithValidatorRule("+38"));
        ObjectValidator<String> validator = new RulesBasedObjectValidator<>(rules);

        try{
            String phone = "+380000000001f";
            validator.validate(phone);
            //далее работа с номером
        }catch (ValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
