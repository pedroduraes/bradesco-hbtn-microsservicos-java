package com.example.demo.exception;

public class UserIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5299763309235587359L;

	
	public UserIdException() {
		super();
	}

	public UserIdException(String message) {
		super(message);
	}

	public UserIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserIdException(Throwable cause) {
		super(cause);
	}


}
