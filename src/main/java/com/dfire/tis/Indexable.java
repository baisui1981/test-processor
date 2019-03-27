package com.dfire.tis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE })
public @interface Indexable {

	/**
	 * Optional indication of a type to which the resolved instance must be
	 * assignable.
	 * 
	 * @return the type of instance
	 */
	Class<?> type() default Object.class;

}
