package com.ashish.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ashish.dto.Person;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person person = new Person();
		person.setId(1);
		person.setFirstName("Ashish");
		person.setLastName("Kale");
		person.setSalary(10000.50);*/
		
		Person person1 = new Person();
		person1.setId(2);
		person1.setFirstName("Someshwar");
		person1.setLastName("Kale");
		person1.setSalary(2000.75);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
	//	session.persist(person);
		session.save(person1);
		session.getTransaction().commit();
		session.close();

	}

}
