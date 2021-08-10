package com.expensetracker.releasev1.exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String message){
		super(message);
	}

}
