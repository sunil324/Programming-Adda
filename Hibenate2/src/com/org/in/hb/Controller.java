package com.org.in.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.org.in.Student;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

		SessionFactory factory=new Configuration()
								.configure("Hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session=factory.getCurrentSession();
		Student thestudent=new Student("sunil","singh","ss8450900@gmail.com");
		session.beginTransaction();
		
		session.save(thestudent);
		session.getTransaction().commit();
		
		}catch(Exception ex) {
			
		}
		finally {
			System.out.println("Successful");
		}
		
	}

}
