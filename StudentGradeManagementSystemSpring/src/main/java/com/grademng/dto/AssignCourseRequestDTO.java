package com.grademng.dto;

public class AssignCourseRequestDTO {
	
	private String studentName;
	private Long assignedCourseId;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getAssignedCourseId() {
		return assignedCourseId;
	}
	public void setAssignedCourseId(Long assignedCourseId) {
		this.assignedCourseId = assignedCourseId;
	}
}
