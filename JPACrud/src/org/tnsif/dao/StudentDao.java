package org.tnsif.dao;

import org.tnsif.entities.Student;

public interface StudentDao {

	//abstract method
	void addStudent(Student stud);//creation
	Student getStudent (int rollno); //retrieve
	void updateStudent(Student stud); //update
	void removeStudent(Student stud); //deletion
	
	void beginTransaction();
	void commitTransaction();
	
}