package spring.com.in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Sports theSports=context.getBean("myCoach",Sports.class);
		
		System.out.println(theSports.GetdailyWorkout());
		
		context.close();

	}

}
