package com.humanresource.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> employeeExceptionHandler(EmployeeException e, WebRequest request){
		
		MyErrorDetails myErrorDetails = new MyErrorDetails();
		myErrorDetails.setMessage(e.getMessage());
		myErrorDetails.setTimestamp(LocalDateTime.now());
		myErrorDetails.setDescription(request.getDescription(false));
		
		return new ResponseEntity<>(myErrorDetails,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception e, WebRequest request){
		
		MyErrorDetails myErrorDetails = new MyErrorDetails();
		myErrorDetails.setMessage(e.getMessage());
		myErrorDetails.setTimestamp(LocalDateTime.now());
		myErrorDetails.setDescription(request.getDescription(false));
		
		return new ResponseEntity<>(myErrorDetails,HttpStatus.BAD_REQUEST);
		
	}
	
}
