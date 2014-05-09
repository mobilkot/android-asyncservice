package com.joanzap.android.kiss.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Cached {

    String NO_KEY = "__NO_KEY";

    String key() default NO_KEY;

}