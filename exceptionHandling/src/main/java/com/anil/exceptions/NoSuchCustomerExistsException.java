package com.anil.exceptions;

public class NoSuchCustomerExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String message;
	public NoSuchCustomerExistsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoSuchCustomerExistsException(String message) {
		super(message);
		this.message=message;
		// TODO Auto-generated constructor stub
	}
	

}
