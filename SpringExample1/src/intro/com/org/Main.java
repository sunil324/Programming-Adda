package intro.com.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Intro intro=context.getBean("b",Intro.class);
		intro.displayinfo();
		context.close();

	}

}
