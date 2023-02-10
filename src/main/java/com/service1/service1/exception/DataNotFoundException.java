package com.service1.service1.exception;

//@ResponseStatus(code = HttpStatus.BAD_REQUEST) this response status is overriden by the class that extends ResponseEntityExceptionHandler
// so commented out this line
public class DataNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6591295320714060281L;

	public DataNotFoundException(String message) {
		super(message);
	}
}
