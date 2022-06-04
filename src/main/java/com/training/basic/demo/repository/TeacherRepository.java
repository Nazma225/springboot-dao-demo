package com.training.basic.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.basic.demo.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	Optional<Teacher> findByTeacherSubject(String subject);
	
	Teacher findByPhoneNumber(long number);
}