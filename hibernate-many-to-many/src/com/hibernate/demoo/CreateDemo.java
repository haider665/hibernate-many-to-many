package com.hibernate.demoo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Student;

public class CreateDemo {

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
			
			// create student object
			
			Student student = new Student("haider");
			Student student2 = new Student("mofiz");
			
			session.save(student);
			session.save(student2);
			
			// create courses
			
			Course  course = new Course("cse110");
			Course  course2 = new Course("cse111");
			
			// mapping student with course
			
			course.add(student);
			course2.add(student);
			course2.add(student2);
			
			session.save(course);
			session.save(course2);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("done");
			
			
			
			
		}
		finally {

			factory.close();
		}
		
		
		

	}
	
	
	
	

}










