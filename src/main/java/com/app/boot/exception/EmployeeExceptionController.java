package com.app.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionController {

	@ExceptionHandler(value=EmployeeException.class)
	public ResponseEntity<Object> exception(EmployeeException employeeException){
		return new ResponseEntity<>("Details are not available", HttpStatus.NOT_FOUND);
		
	}
}
