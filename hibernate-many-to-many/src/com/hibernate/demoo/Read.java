package com.hibernate.demoo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Student;

public class Read {

	public static void main(String[] args) {
		
		
		// session Factory
		SessionFactory factory= (SessionFactory) new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).
				buildSessionFactory();
		// session factory
		Session session = factory.getCurrentSession();
		
		try {
			
			// begin transaction
			session.beginTransaction();
			
			int id=3;
			Course c = (Course) session.get(Course.class, id);
			System.out.println(c);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("done");
			
			
			
			
		}
		finally {

			factory.close();
		}
		
		
		

	}
	
	
	
	

}










