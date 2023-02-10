package com.service1.service1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class DataNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6591295320714060281L;

	public DataNotFoundException(String message) {
		super(message);
	}
}
