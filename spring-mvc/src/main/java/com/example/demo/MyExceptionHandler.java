package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler({Exception.class})
	@ResponseBody
	public String exceptionProcess(Exception e) {
		e.printStackTrace();
		return "apologized page";
	}
}
