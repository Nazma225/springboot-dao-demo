package com.training.basic.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.basic.demo.entity.Teacher;
import com.training.basic.demo.model.TeacherRequest;
import com.training.basic.demo.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository trepository;
	
	public String getTeacher(int id) {
		Optional<Teacher> Teacher = trepository.findById(id);
		return Teacher.get().getTeacherName();
	}
	
	public String addTeacher(TeacherRequest teacherRequest) {
		String msg="Teacher not added";
		Teacher teacher = new Teacher(teacherRequest.getTeacherId(),teacherRequest.getTeacherName(),teacherRequest.getPhoneNumber(),teacherRequest.getTeacherSubject());
		if(! trepository.existsById(teacher.getTeacherId())) {
		trepository.saveAndFlush(teacher);
		msg = "Teacher added successfully with id:"+teacher.getTeacherId();
		}
		return msg;
	}
	
	public String  deleteTeacher(int id) {
		
		String msg="Teacher not deleted";
		if(trepository.existsById(id)) {
		 trepository.deleteById(id);
		 msg="Teacher deleted with id:"+id;
		}
		return msg;
	}
	
	public String updateTeacher(TeacherRequest teacherRequest) {
		
		String msg ="Failed to update teacher record";
		Teacher teacher = new Teacher(teacherRequest.getTeacherId(),teacherRequest.getTeacherName(),teacherRequest.getPhoneNumber(),teacherRequest.getTeacherSubject());
		
		if(trepository.existsById(teacher.getTeacherId())) {
		trepository.saveAndFlush(teacher);
		msg="Successfully updated teacher with id"+teacher.getTeacherId();
		}
		return msg;
		
		
	}
}
