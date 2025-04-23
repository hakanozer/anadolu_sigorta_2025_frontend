package com.works.customValid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {NoteCategoryService.class})
public @interface NoteCategory {

    String message() default "Category Not Found";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}
