package com.reactive.spring.oracle.validation;

import com.reactive.spring.oracle.validation.impl.CustomerNameConstraintImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomerNameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerNameConstraint {
  String message() default "Name is invalid";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
