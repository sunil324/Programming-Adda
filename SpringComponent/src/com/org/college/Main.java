package com.org.college;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		College college=context.getBean("collegebean",College.class);
		college.test();
		System.out.println("bean is created....");
		context.close();

	}

}
