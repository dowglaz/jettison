
package com.jettison.entrypoint.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface JetPost {
	public Class<?> useCase();
	public String method() default "save";
}
