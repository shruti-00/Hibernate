package org.tnsif.service;

import org.tnsif.entities.Student;

public interface StudentService {

	//abstract method
	void add(Student stud);
	void update(Student stud);
	void delete(Student stud);
	Student get(int rollno);
	
}
