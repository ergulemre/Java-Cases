package com.grademng.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="student_courses", joinColumns={@JoinColumn(name="student_id", referencedColumnName="ID")}
    , inverseJoinColumns={@JoinColumn(name="course_id", referencedColumnName="id")}) 
    private Set<Course> courses;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="student_grades", joinColumns={@JoinColumn(name="student_id", referencedColumnName="ID")}
    , inverseJoinColumns={@JoinColumn(name="grade_courseId", referencedColumnName="courseId")})
    @PrimaryKeyJoinColumn
    private List<Grade> grades;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}	
}