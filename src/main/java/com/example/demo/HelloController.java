package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello from my spring boot application!";
	}

	@RequestMapping("/tools")
	String myTools() {
		return "Hello from my spring boot Tools application!";
	}
	
	@RequestMapping("/students/{name}/{id}")
	String myStudentIntro(@PathVariable String name,@PathVariable Long id) {
		return "Hello this is "+name +" and my id is "+id;
	}

	/* @RequestMapping("calculate/{a}/{b}")
	
	public class addOfNumbers{
		
	public String calculateAdd(@PathVariable("a")int a1,@PathVariable("b") int b1) {
		
	   int c=a1+b1;
		return "Addition of two numbers is " +c;
	}
} */
	
	@RequestMapping("/calculate/{a}/{b}")

	String calculate(@PathVariable Double a,@PathVariable Double b) {
	double x = a+b;
	double y = a-b;
	double z = a*b;
	double k = a/b;
	return "Add = "+x +"Sub = "+y +"Mul  = "+z +"Div = "+k;
	}

}