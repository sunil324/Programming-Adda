package com.springdemo.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Question q=context.getBean("q",Question.class);
		q.displayInfo();
		context.close();

	}

}
