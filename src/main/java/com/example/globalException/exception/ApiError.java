package com.example.globalException.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiError {
	
	private String message;
	private HttpStatus status;
	private LocalDateTime dateTime;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public ApiError(String message, HttpStatus status, LocalDateTime dateTime) {
		super();
		this.message = message;
		this.status = status;
		this.dateTime = dateTime;
	}
	
	

}
