package demo.spring.in;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the object
		// Coach theCoach = new BaseballCoach();
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach theCoach = context.getBean("Mycoach" ,Coach.class);
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		

		context.close();

	}

}
