package com.example.demo.exception;

public class CPFException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5693380027633386447L;

	public CPFException() {
		super();
	}

	public CPFException(String message) {
		super(message);
	}

	public CPFException(String message, Throwable cause) {
		super(message, cause);
	}

	public CPFException(Throwable cause) {
		super(cause);
	}

}
