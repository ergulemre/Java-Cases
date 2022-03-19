package com.grademng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.grademng.entity.Course;
import com.grademng.entity.Grade;
import com.grademng.entity.Student;
import com.grademng.repository.CourseRepository;
import com.grademng.repository.StudentRepository;

@SpringBootApplication
public class GrademngApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrademngApplication.class, args);
	}
	
	//load sample grades data
	@Bean
    public CommandLineRunner mappingDemo(StudentRepository studentRepository,
                                         CourseRepository courseRepository) {
        return args -> {

        	Student std1 = new Student();
        	std1.setName("Emre");
        	
        	Course crs1 = new Course();
        	crs1.setCourseName("Mathematics");
        	
        	Set<Course> courseOfFirstStd = new HashSet<Course>();
        	courseOfFirstStd.add(crs1);
        	
        	std1.setCourses(courseOfFirstStd);
        	
        	Student std = studentRepository.save(std1);
        	Course course = courseRepository.save(crs1);
        	
        	Grade grade = new Grade();
        	grade.setFirstExam(40);
        	grade.setSecondExam(76);
        	grade.setSchoolYear(20192020);
        	grade.setStudent_id(std.getId());
        	grade.setCourseId(course.getId());
        	
        	List<Grade> courseOfGrade = new ArrayList<Grade>();
        	courseOfGrade.add(grade);
        	
        	std1.setGrades(courseOfGrade);
        	
        	studentRepository.save(std1);
        };
    }
}
