package com.prowings.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestHibernate {
	
	public static void main(String[] args) {
		
		System.out.println("Creating session factory object!!");
		//step-1 : create session factory object
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//Step-2 : Create Session object
		Session session = sessionFactory.openSession();
		
		//Step-3 : Create Transaction object
		Transaction txn = session.beginTransaction(); //--txn started
		
		
        Car car1 = new Car("BE-6", "Mahindra", 250);
		session.save(car1);
		
		
		txn.commit();
		session.close();
		
		System.out.println("Car object saved to DB successfully!!");
		
	}

}