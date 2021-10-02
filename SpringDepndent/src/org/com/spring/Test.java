package org.com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {

	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	Question question =context.getBean("q",Question.class);
	question.displayInfo();
	context.close();
	

	
}
}
