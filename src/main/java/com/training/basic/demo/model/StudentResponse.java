package com.training.basic.demo.model;

public class StudentResponse {

	private Integer studId;
	
	private String name;
	
	private String address;
	
	private float marks;
	
	private String subject;
	
	private boolean isActive;
	
	private String assignedTeacher;

	public Integer getStudId() {
		return studId;
	}

	public StudentResponse() {
		super();
		
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAssignedTeacher() {
		return assignedTeacher;
	}

	public void setAssignedTeacher(String assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}
}
