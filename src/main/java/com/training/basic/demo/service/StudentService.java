package com.training.basic.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.basic.demo.entity.Student;
import com.training.basic.demo.entity.Teacher;
import com.training.basic.demo.model.StudentRequest;
import com.training.basic.demo.model.StudentResponse;
import com.training.basic.demo.repository.StudentRepository;
import com.training.basic.demo.repository.TeacherRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private TeacherRepository teacherRepository;

	public String fetchStudentName(int id) {
		Optional<Student> studentOpt = repository.findById(id);
		if(studentOpt.isPresent()) {
			Student student = studentOpt.get();
			return student.getName();
		}
		return null;
	}

	public String addStudent(StudentRequest studentRequest) {
		Student student = new Student(studentRequest.getName(), studentRequest.getAddress(), studentRequest.getMarks(), studentRequest.getSubject(), studentRequest.getMobile());
		String msg = "Failed to Add Student Info.";
		try {
			if(!repository.existsByMobile(student.getMobile())) {
				repository.saveAndFlush(student);
				msg ="Student Added Successfully with Id: "+student.getStudId().toString();
			}
		} catch(Exception e) {
			return msg;
		}
		return msg;
	}

	public String deleteStudent(int id) {
		String msg = "Failed to delete student with id:" +id;
		if(repository.existsById(id)) {
			repository.deleteById(id);
			msg="Student deleted with id:" +id;
		}
		return msg;
	}

	public String updateStudent(StudentRequest studentRequest) {
		String msg = "Failed to Update Student Info.";
		Optional<Student> optStudent = repository.findByMobile(studentRequest.getMobile());

		try {
			if(optStudent.isPresent()) {
				Student student = optStudent.get();
				student.setAddress(studentRequest.getAddress());
				student.setMarks(studentRequest.getMarks());
				student.setName(studentRequest.getName());
				repository.saveAndFlush(student);
				msg ="Student Added Successfully with Id: "+student.getStudId().toString();
			}

		} catch(Exception e) {
			return msg;
		}
		return msg;
	}

	public StudentResponse fetchStudent(int id) {
		StudentResponse response = new StudentResponse();
		Optional<Student> studentOpt = repository.findById(id);
		if(studentOpt.isPresent()) {
			Student student = studentOpt.get();
			response.setAddress(student.getAddress());
			response.setMarks(student.getMarks());
			response.setName(student.getName());
			response.setStudId(student.getStudId());
			response.setSubject(student.getSubject());
			response.setActive(true);
			Optional<Teacher> teacherOpt = teacherRepository.findByTeacherSubject(student.getSubject());
			Teacher teacher = teacherOpt.isPresent() ? teacherOpt.get(): new Teacher();
			response.setAssignedTeacher(teacher.getTeacherName());
		}
		return response;
	}

	public List<StudentResponse> fetchAllStudents() {
		List<StudentResponse> listReponse =  new ArrayList<>();
		List<Student> students = repository.findAll();
		for (Student student : students) {
			StudentResponse response = new StudentResponse();
			response.setAddress(student.getAddress());
			response.setMarks(student.getMarks());
			response.setName(student.getName());
			response.setStudId(student.getStudId());
			response.setSubject(student.getSubject());
			response.setActive(true);
			Optional<Teacher> teacherOpt = teacherRepository.findByTeacherSubject(student.getSubject());
			Teacher teacher = teacherOpt.isPresent() ? teacherOpt.get(): new Teacher();
			response.setAssignedTeacher(teacher.getTeacherName());
			listReponse.add(response);
		}
		return listReponse;
	}
}
