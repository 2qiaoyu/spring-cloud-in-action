package com.joham.annotation;

import java.lang.annotation.*;

/**
 * @author joham
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogger {
    String value() default "";
}
