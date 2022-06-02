package com.training.basic.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	@Id
	private Integer teacherId;
	
	@Column(name = "teacher_name")
	private String teacherName;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "teacher_subject")
	private String teacherSubject;
	
	public Teacher() {
		super();
	}
	
	public Teacher(Integer teacherId, String teacherName, long phoneNumber, String teacherSubject) {
		this.teacherId= teacherId;
		this.teacherName = teacherName;
		this.phoneNumber=phoneNumber;
		this.teacherSubject=teacherSubject;
	
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	
	
}
