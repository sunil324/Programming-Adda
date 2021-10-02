package hibernate.org.in.co;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.org.in.Student;

public class DemoController {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			Student thestudent=new Student();
			thestudent.setFirstname("sunil");
			thestudent.setLastname("singh");
			thestudent.setEmail("ss8450900553");
			session.beginTransaction();
			session.save(thestudent);

			session.getTransaction().commit();
		}finally {
			factory.close();
		}
		
	}

}
