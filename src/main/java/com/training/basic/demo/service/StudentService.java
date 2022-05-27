package com.training.basic.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.basic.demo.entity.Student;
import com.training.basic.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public String fetchStudentName(int id) {
		Optional<Student> student = repository.findById(id);
		return student.isPresent() ? student.get().getName() : "Nazma";
	}

}
