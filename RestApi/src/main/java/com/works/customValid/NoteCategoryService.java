package com.works.customValid;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class NoteCategoryService implements ConstraintValidator<NoteCategory,String> {

    String[] categories = {"okul", "is", "ev"};

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean status = Arrays.asList(categories).contains(value);
        return status;
    }

}
