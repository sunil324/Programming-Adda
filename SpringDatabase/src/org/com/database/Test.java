package org.com.database;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	EmployeeDao dao=context.getBean("edao", EmployeeDao.class);
	int status=dao.deleteEmployee(new Employee());
	System.out.println(status);
	
	context.close();

	}

}
