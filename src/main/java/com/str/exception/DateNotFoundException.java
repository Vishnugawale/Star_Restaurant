package com.str.exception;

public class DateNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public DateNotFoundException (String massage) {
		super(massage);
}
}