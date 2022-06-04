package com.training.basic.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.basic.demo.model.StudentRequest;
import com.training.basic.demo.model.StudentResponse;
import com.training.basic.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping(value="/name/{id}")
	public String fetchStudentName(@PathVariable(name="id") int id) {
		return service.fetchStudentName(id);
	}
	
	@PostMapping(value ="/add", produces = {"application/json"}, consumes = {"application/json"})
	public String addStudent(@RequestBody StudentRequest student) {
		return service.addStudent(student);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteStudent(@PathVariable(name="id") int id) {
		return service.deleteStudent(id);
		
	}
	
	@PutMapping(value ="/update", produces = {"application/json"}, consumes = {"application/json"})
	public String updateStudent(@RequestBody StudentRequest student) {
		return service.updateStudent(student);
	}
	
	@GetMapping(value="/{id}")
	public StudentResponse fetchStudent(@PathVariable(name="id") int id) {
		return service.fetchStudent(id);
	}
	
	@GetMapping(value="/")
	public List<StudentResponse> fetchAllStudents() {
		return service.fetchAllStudents();
	}
	
}
