package com.str.exception;

public class CustomersNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomersNotFoundException (String massage) {
		super(massage);
}
}