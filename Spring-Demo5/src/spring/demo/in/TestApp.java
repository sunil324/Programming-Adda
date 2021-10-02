package spring.demo.in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applcationContext.xml");
		
		Sports theSports=context.getBean("myCoach",Sports.class);
		System.out.println(theSports.GetdailyWorkout());
		context.close();
		
		// TODO Auto-generated method stub

	}

}
