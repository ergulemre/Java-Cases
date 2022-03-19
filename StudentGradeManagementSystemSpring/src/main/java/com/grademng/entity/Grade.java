package com.grademng.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grade")
public class Grade implements Serializable{
	
	@Id
	@Column(name="student_id")
	private Long student_id;
	
    @Column(name="firstExam")
    private int firstExam;
    
    @Column(name="secondExam")
    private int secondExam;
    
    @Column(name="schoolYear")
    private int schoolYear;
    
    @Column(name="courseId")
    private Long courseId;
    
	public int getFirstExam() {
		return firstExam;
	}
	public void setFirstExam(int firstExam) {
		this.firstExam = firstExam;
	}
	public int getSecondExam() {
		return secondExam;
	}
	public void setSecondExam(int secondExam) {
		this.secondExam = secondExam;
	}
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
}
