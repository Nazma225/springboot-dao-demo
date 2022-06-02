package com.training.basic.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.basic.demo.entity.Student;
import com.training.basic.demo.entity.Teacher;
import com.training.basic.demo.repository.StudentRepository;
import com.training.basic.demo.repository.TeacherRepository;

@SpringBootApplication
public class SpringbootDaoDemoApplication {
	
	@Autowired
	StudentRepository repository;
	
	@Autowired
	TeacherRepository trepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDaoDemoApplication.class, args);
	}
	
	@PostConstruct
	public void populateData() {
		List<Student> students = new ArrayList<>();
		Student student1 = new Student( "student1", "NYC", 90.0f, "Maths", "9876543210");
		Student student2 = new Student("student2", "California", 80.5f, "Science", "8976543210");
		Student student3 = new Student( "student3", "Texas", 80.0f, "SST", "789654321");
		Student student4 = new Student("Student4", "Chicago", 82.5f, "English", "6789543210");
		Student student5 = new Student("Nazma", "Hyd", 99.5f, "Java", "999999999");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		repository.saveAll(students);
		
		List<Teacher> teachers = new ArrayList<>();
		Teacher t1 = new Teacher(1,"Vikash", 9019019010l, "Java");
		Teacher t2 = new Teacher(2,"Ravi",9119119119l,"SpringBoot");
		Teacher t3 = new Teacher(3,"Nazma",5105105105l,"CoreJava");
		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);
		trepository.saveAll(teachers);
	}
}
