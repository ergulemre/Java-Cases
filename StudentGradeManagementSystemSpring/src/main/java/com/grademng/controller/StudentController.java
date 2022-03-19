package com.grademng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grademng.dto.StudentGradesRequestDTO;
import com.grademng.entity.Grade;
import com.grademng.entity.Student;
import com.grademng.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> allStudent() throws Exception {
		return studentService.allStudent();
	}
	
	@PostMapping("/grades")
	public List<Grade> studentGrades(@RequestBody StudentGradesRequestDTO studentGradesRequest) throws Exception {
		
		return studentService.studentGrades(studentGradesRequest);
	}
	
	@PostMapping("/grades/all")
	public List<Grade> allStudentsGrades(@RequestBody StudentGradesRequestDTO studentGradesRequest) throws Exception {
		
		return studentService.allStudentsGrades(studentGradesRequest);
	}
	
	@DeleteMapping("/delete")
	public String deleteItem(HttpEntity<String> httpEntity) throws Exception {
		return null;
	}
}

