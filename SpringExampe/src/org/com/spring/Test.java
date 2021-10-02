package org.com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Couch couch=context.getBean("b", Couch.class);
		System.out.println(couch.getDailyWOrk());
		context.close();
		
	}

}
