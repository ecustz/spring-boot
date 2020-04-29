package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProcessController {
	
	@RequestMapping("/process")
	@ResponseBody
	public String process(@RequestBody String json) {
		return json;
	}
	
	@RequestMapping("/process1")
	@ResponseBody
	public String process1() {
		return "json";
	}
	
	@RequestMapping("/process2")
	@ResponseBody
	public User processObject(String name) {
		return new User("u1", 18);
	}
	
	@RequestMapping("/e")
	@ResponseBody
	public String processException() {
		int [] a = {1,2};
		int b = a[4]-1;
		return "exception";
	}
}
