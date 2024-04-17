package com.innotech.EvenNumberOrZero;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EvenNumberOrZeroValidator.class)
@Documented
public @interface EvenNumberOrZero {
    String message() default "Must be an even number or zero";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
