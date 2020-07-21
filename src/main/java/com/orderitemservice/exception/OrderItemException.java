package com.orderitemservice.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OrderItemException {

	
	@ExceptionHandler(value= {ItemNotFoundException.class,OrderException.class})
	public OrderError OrderExceptioin() {
		
		OrderError error = new OrderError();
		error.setErrorcode("errorcode");
		error.setErrormessage("errormessage");
		return error;
		
		
	}
 
}
