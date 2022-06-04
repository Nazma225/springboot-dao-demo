package com.training.basic.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.basic.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	boolean existsByMobile(String mobile);
	
	Optional<Student> findByMobile(String mobile);

}

