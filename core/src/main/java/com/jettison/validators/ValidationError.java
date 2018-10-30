package com.jettison.validators;

import java.io.Serializable;

public interface ValidationError extends Serializable {
	String getMessage();
}
