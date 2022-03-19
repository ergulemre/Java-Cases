package com.grademng.dto;

public class StudentGradesRequestDTO {

	private int schoolYear;
	private Long courseId;
	private Long studentId;
	
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}
