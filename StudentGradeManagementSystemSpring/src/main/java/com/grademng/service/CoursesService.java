package com.grademng.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grademng.dto.AssignCourseRequestDTO;
import com.grademng.entity.Course;
import com.grademng.entity.Student;
import com.grademng.repository.CourseRepository;
import com.grademng.repository.StudentRepository;
import com.grademng.util.ResponseBuilder;

@Service
public class CoursesService {

	@Autowired
	public CourseRepository coursesRepository;
	
	@Autowired
	public StudentRepository studentReposiory;
	
	public Course addNewCourse(Course course) throws Exception {
		if(course.getCourseName()==null) {
			throw new Exception("Course name must not be empty.");
		}
		return coursesRepository.save(course);
	}
	
	public void assignNewCourseToStudent(AssignCourseRequestDTO req) {
		
		Optional<Course> course = coursesRepository.findById(req.getAssignedCourseId());
		
		Student std = studentReposiory.findByName(req.getStudentName());
		Set<Course> stdCurrentCourses = std.getCourses();
		
		stdCurrentCourses.add(course.get());
		std.setCourses(stdCurrentCourses);
		
		studentReposiory.save(std);		
	}
	
	public List<Course> getAllCourse() {
		return coursesRepository.findAll();
	}
}
