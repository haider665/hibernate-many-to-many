package com.hibernate.demoo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Student;

public class Delete {

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
			
//			// delete student
//			
//			int id=4;
//			Student st = (Student) session.get(Student.class, id);
//			
//			session.delete(st);
			
			// delete a course
			int id=3;
			Course c = (Course) session.get(Course.class, id);
			session.delete(c);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("done");
			
			
			
			
		}
		finally {

			factory.close();
		}
		
		
		

	}
	
	
	
	

}










