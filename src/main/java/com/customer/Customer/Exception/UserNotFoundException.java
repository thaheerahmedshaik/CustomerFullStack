package com.customer.Customer.Exception;

@SuppressWarnings("serial")
public class UserNotFoundException  extends RuntimeException {

	public UserNotFoundException(String meassage){
		super(meassage);
	}
}
