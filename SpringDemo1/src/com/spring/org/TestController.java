package com.spring.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student student=context.getBean("Studentbean",Student.class);
		student.displayInfo();
		context.close();
		
	}

}
