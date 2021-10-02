package com.spring.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee=context.getBean("Employeebean",Employee.class);
		employee.show();
		context.close();

	}

}
