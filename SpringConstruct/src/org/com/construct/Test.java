package org.com.construct;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee employee=context.getBean("b", Employee.class);
		
		employee.show();
		context.close();
		
	}

}
