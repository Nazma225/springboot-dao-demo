package com.training.basic.demo.model;

public class TeacherRequest {
	
	private Integer teacherId;
	
	private String teacherName;
	
	private long phoneNumber;
	
	private String teacherSubject;
	
	public TeacherRequest() {
		super();
	}
	
	public TeacherRequest(Integer teacherId, String teacherName, long phoneNumber, String teacherSubject) {
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
