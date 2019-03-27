package com.dfire.tis;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.SOURCE;

@Indexable
@Retention(SOURCE)
@Target({ TYPE, FIELD, METHOD })
@Documented
public @interface Extension {

}
