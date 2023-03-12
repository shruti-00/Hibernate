package org.tnsif.service;

import org.tnsif.dao.StudentDao;
import org.tnsif.dao.StudentDaoImpl;
import org.tnsif.entities.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}

	@Override
	public void add(Student stud) {
		dao.beginTransaction();
		dao.addStudent(stud);
		dao.commitTransaction();
		
	}

	@Override
	public void update(Student stud) {
		dao.beginTransaction();
		dao.updateStudent(stud);
		dao.commitTransaction();
		
	}

	@Override
	public void delete(Student stud) {
		dao.beginTransaction();
		dao.removeStudent(stud);
		dao.commitTransaction();
	}

	@Override
	public Student get(int rollno) {
		Student stud = dao.getStudent(rollno);
		return stud;
		
	}

}
