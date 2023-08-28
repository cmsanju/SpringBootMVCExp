package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("/greet")
	public String sayHello()
	{
		return "home";
	}
	
	@RequestMapping("/usertest")
	public String sayHelloAgain()
	{
		return "hello1";
	}
}
