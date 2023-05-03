package com.dgmf.springbootrestapi.service;

import com.dgmf.springbootrestapi.model.Student;

public interface StudentService {
	Student getById(int id);
	Student getByName(String name);
	boolean save(Student student);
}
