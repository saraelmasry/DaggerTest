package com.example.daggertest;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Documented
@Retention(value = RUNTIME)
public @interface Milk {
    String value() default "milk";
}
