package com.jettison.validators;

import java.util.stream.Stream;

@FunctionalInterface
public interface Validator<T> {
	Stream<ValidationError> validate();
}
