package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager em;
	 

	public StudentDaoImpl() {
		em=JPAUtil.getEntityManager();
		}

	//creation/insertion/add
	@Override
	public void addStudent(Student stud) {
		em.persist(stud);
	}

	//retrieve/fimd/search
	@Override
	public Student getStudent(int rollno) {
		Student stud = em.find(Student.class, rollno);
		return stud;
	}

	//updation
	@Override
	public void updateStudent(Student stud) {
		em.merge(stud);
		
	}

	//deletion
	@Override
	public void removeStudent(Student stud) {
		em.remove(stud);
		
	}

	//below 2 methods comes under transaction
	//starting the transaction
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	//stopping the transaction
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
