package com.gmail.kutilandrej.springmvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

  public String value() default "xyz.com";
  public String message() default "default error message";

  public Class<?>[] groups() default {};
  public Class<? extends Payload> [] payload() default {};
}
