package com.grademng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grademng.dto.AssignCourseRequestDTO;
import com.grademng.entity.Course;
import com.grademng.service.CoursesService;
import com.grademng.util.ResponseBuilder;
import com.grademng.util.ServiceResponse;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	public CoursesService coursesService;
	
	@PostMapping("/add")
	public ResponseEntity<ServiceResponse<Course>> addNewCourse(@RequestBody Course course) throws Exception {
		Course savedCourse = coursesService.addNewCourse(course);
		return ResponseBuilder.success(savedCourse, "Course saved.");
	}
	
	@PostMapping("assign/student")
	public ResponseEntity<ServiceResponse<Course>> assignCourseToStudent(@RequestBody AssignCourseRequestDTO course) throws Exception {
		coursesService.assignNewCourseToStudent(course);
		return ResponseBuilder.success("Course assigned.");
	}
	
	@GetMapping("/get")
	public List<Course> getAllCourses() throws Exception {
		List<Course> allCourse = coursesService.getAllCourse();
		return allCourse;
	}
}
