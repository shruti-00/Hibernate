package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//one employee
		Employee12 emp1=new Employee12();
		emp1.setEmpname("Shruti Salve");
		
		//2nd employee
		Employee12 emp2=new Employee12();
		emp2.setEmpname("Siddhika Ghule");
		
		//first address
		Address a1=new Address();
		a1.setPincode(422401);
		a1.setArea("Deolali Camp");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		
		//first address
		Address a2=new Address();
		a2.setPincode(433401);
		a2.setArea("Airoli");
		a2.setCity("Mumbai");
		a2.setState("Maharashtra");	
		
		emp2.setAddress(a1);
		emp1.setAddress(a1);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}
}
