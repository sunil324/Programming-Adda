package com.springdemo2.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee=context.getBean("emp",Employee.class);
		employee.displayInfo();
		context.close();
	}

}
