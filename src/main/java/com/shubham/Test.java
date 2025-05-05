package com.shubham;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		
		IUserService service = ctxt.getBean(IUserService.class); // In the reference variable it will hold the implementation class object.
		                                                           //we can give the implementation class also
		
		
		//System.out.println(service.getClass().getName());
		
		String name = service.getName(101);
		
		System.out.println("User Name: "+ name);
	
	}
}
