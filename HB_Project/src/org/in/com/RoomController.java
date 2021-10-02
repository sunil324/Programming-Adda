package org.in.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hb.in.com.Student;

public class RoomController {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionfactory=new Configuration()
										.configure()
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		
		Session session=sessionfactory.getCurrentSession();
		
		
		try {
			System.out.println("Creating Object:");
			
			Student student=new Student("sunil","sunil@gmail.com");
			
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			
			
			
		}finally{
			sessionfactory.close();
		}
		
		
		
		
		
	}

}
