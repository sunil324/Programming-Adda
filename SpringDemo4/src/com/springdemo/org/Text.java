package com.springdemo.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee=context.getBean("EmployeeBean", Employee.class);
		employee.display();
		context.close();

	}

}
