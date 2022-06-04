package com.training.basic.demo.model;

public class TeacherResponse {
	
	private Integer teacherId;
	
	private String teacherName;
	
	private float phoneNumber;
	
	private String teacherSubject;
	
	public TeacherResponse() {
		super();
	}
	
	public TeacherResponse(Integer teacherId, String teacherName, float phoneNumber, String teacherSubject) {
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
	public float getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(float phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
}
