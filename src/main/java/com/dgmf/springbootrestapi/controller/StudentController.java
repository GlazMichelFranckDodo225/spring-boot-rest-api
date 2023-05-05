package com.dgmf.springbootrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dgmf.springbootrestapi.model.Student;
import com.dgmf.springbootrestapi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/id")
	public Student getById(@RequestParam(value = "id", defaultValue = "1") int id) {
		return studentService.getById(id);
	}
	
	

}
