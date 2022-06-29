package com.reactive.spring.oracle.validation;

import com.reactive.spring.oracle.validation.impl.CustomerCountryConstraintImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomerCountryConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerCountryConstraint {
  String message() default "Country is invalid";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
