package com.dgmf.springbootrestapi.service.impl;

import org.springframework.stereotype.Service;

import com.dgmf.springbootrestapi.model.Student;
import com.dgmf.springbootrestapi.service.StudentService;

@Service
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
		Student student = new Student();
		student.setId(2);
		student.setName(name);
		student.setMobileNo("2222222222");
		
		return student;
	}

	@Override
	public boolean save(Student student) {
		System.out.println("id : " + student.getId() + 
				"\nName : " + student.getName() + 
				"\nMobile No : " + student.getMobileNo());;
		return false;
	}

}
