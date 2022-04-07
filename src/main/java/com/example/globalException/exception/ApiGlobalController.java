package com.example.globalException.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiGlobalController extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(NoDataFoundException.class)
	 public ResponseEntity<Object> handleExceptions(NoDataFoundException ex,WebRequest request){
		
	
		
		return new ResponseEntity<>(new ApiError("Data Not Found", HttpStatus.NOT_FOUND, LocalDateTime.now()),HttpStatus.NOT_ACCEPTABLE);
		
		
		
		
	}

}
