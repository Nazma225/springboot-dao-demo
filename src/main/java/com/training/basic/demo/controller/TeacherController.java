package com.training.basic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.basic.demo.model.TeacherRequest;
import com.training.basic.demo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService service;
	
	@GetMapping(value = "/name/{id}")
	public String getTeacherName(@PathVariable(name = "id") int id) {
		return service.getTeacher(id);
		
	}
	
	@PostMapping(value ="/add", produces = {"application/json"}, consumes = {"application/json"})
	public String addTeacher(@RequestBody TeacherRequest teacher) {
		return service.addTeacher(teacher);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteStudent(@PathVariable(name="id") int id) {
		return service.deleteTeacher(id);
		
	}
	
	@PutMapping(value ="/update", produces = {"application/json"}, consumes = {"application/json"})
	public String updateTeacher(@RequestBody TeacherRequest teacher) {
		return service.updateTeacher(teacher);
	}
	
	
}
