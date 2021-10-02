package com.springdemo2.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicatonContext.xml");
		Employee employee=context.getBean("EmployeeBean", Employee.class);
		employee.display();
		context.close();

	}

}
