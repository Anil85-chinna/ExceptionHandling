package com.anil.exceptions;

public class CustomerAlreadyExistingException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerAlreadyExistingException() {
	}

	String message;
	public CustomerAlreadyExistingException(String message) {
		super(message);
		this.message=message;
		// TODO Auto-generated constructor stub
	}

	

}
