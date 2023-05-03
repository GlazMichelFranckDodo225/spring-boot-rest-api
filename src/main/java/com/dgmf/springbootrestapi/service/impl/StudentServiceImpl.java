package com.dgmf.springbootrestapi.service.impl;

import com.dgmf.springbootrestapi.model.Student;
import com.dgmf.springbootrestapi.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student getById(int id) {
		Student student = new Student();
		student.setId(id);
		student.setName("Name : " + id);
		student.setMobileNo("1111111111");
		
		return student;
	}

	@Override
	public Student getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
