package com.java2blog.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class SpringRestController {
	@RestController
	@RequestMapping("/hello")
	public class SpringRestController {
	 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	 public String hello(@PathVariable String name) {
	 String result="Hello "+name; 
	 return result;
	 }
	}
}
