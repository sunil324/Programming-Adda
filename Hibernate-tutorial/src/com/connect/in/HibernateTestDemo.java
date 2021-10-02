package com.connect.in;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2.in.Unit;

public class HibernateTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		SessionFactory sessionfactory=new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Unit.class)
										.buildSessionFactory();
		Session session=sessionfactory.getCurrentSession();
			try {
				Unit unit=new Unit("1234567","Rajesh");
				
				session.beginTransaction();
				session.save(unit);
				session.getTransaction().commit();

		}finally {
			session.close();
		}
	}

}
