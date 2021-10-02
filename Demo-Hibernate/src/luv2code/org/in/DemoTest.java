package luv2code.org.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.org.in.Student;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		try {
			Session session=factory.getCurrentSession();
			Student thestudent=new Student("sunil","singh","ss@gmail.com","nerul");
			session.beginTransaction();
			session.save(thestudent);
			session.getTransaction().commit();
				
		}finally {
			factory.close();
			
		}
		
		
		
		
		

	}

}
