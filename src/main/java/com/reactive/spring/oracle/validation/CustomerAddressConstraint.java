package com.reactive.spring.oracle.validation;

import com.reactive.spring.oracle.validation.impl.CustomerAddressConstraintImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomerAddressConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerAddressConstraint {
  String message() default "Address is invalid";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
