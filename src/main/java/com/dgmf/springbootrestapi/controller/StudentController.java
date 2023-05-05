package com.dgmf.springbootrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dgmf.springbootrestapi.model.Student;
import com.dgmf.springbootrestapi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	// http://localhost:8080/student/id?id=7
	@GetMapping("/id")
	public Student getById(@RequestParam(value = "id", defaultValue = "1") int id) {
		return studentService.getById(id);
	}
	
	// http://localhost:8080/student/name?name=franck
	@RequestMapping(value = "name", method = RequestMethod.GET) // Equivaut à @GetMapping("/name")
	public Student getByName(@RequestParam(value = "name", defaultValue = "nakesh") String name) {
		return studentService.getByName(name);
	}

}
