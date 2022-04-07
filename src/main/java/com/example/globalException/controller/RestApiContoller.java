package com.example.globalException.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.globalException.exception.NoDataFoundException;


@RestController
public class RestApiContoller {
@GetMapping("/getMessage/{input}")
	public String getMessage(@PathVariable String input) throws NoDataFoundException{
	
	
	String msg=null;
		if(input.equalsIgnoreCase("sriram")) {
	 msg="Hey" +input +" hii";
		}
		else {
			 throw new NoDataFoundException("Input is wrong");
		}
		return  msg;
		
		
		
	}
	
	
	
}
