package com.org.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try {
			System.out.println("Creating new Student  object....");
			Student thestudent=new Student("1","sunil","singh","ss8450900@gmail.com");
			
			session.beginTransaction();
			session.save(thestudent);
			
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
				

	}

}
