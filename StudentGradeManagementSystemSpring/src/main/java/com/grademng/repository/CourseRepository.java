package com.grademng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grademng.entity.Course;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Long> {

	public Course findByCourseName(String name);
}
