package com.grademng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grademng.dto.StudentGradesRequestDTO;
import com.grademng.entity.Grade;
import com.grademng.entity.Student;
import com.grademng.repository.GradeRepository;
import com.grademng.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	public StudentRepository studentsRepository;
	
	@Autowired
	public GradeRepository gradesRepository;
	
	/*public void addStudent() {
		studentsRepository.addStudent("asd", null);
	}*/
	
	public List<Grade> studentGrades(StudentGradesRequestDTO request) {
		
		return gradesRepository.studentGrades(request.getStudentId(), request.getSchoolYear(), request.getCourseId());
	}
	
	public List<Grade> allStudentsGrades(StudentGradesRequestDTO request){
		return gradesRepository.allStudentGrades(request.getSchoolYear(), request.getCourseId());
	}
	
	public List<Student> allStudent() {
		return studentsRepository.findAll();
	}
}
