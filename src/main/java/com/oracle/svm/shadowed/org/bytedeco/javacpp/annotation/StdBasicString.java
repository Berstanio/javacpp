package com.oracle.svm.shadowed.org.bytedeco.javacpp.annotation;

import com.oracle.svm.shadowed.org.bytedeco.javacpp.Pointer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Adapter("BasicStringAdapter")
public @interface StdBasicString {
    /** The template type of {@code BasicStringAdapter}. If not specified, it is
     *  inferred from the value type of the {@link Pointer} or Java array. */
    String value() default "";
}