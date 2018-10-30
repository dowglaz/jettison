package com.jettison.core.converters;

@FunctionalInterface
public interface Converter<S, T> {
	T from(S source);
}
