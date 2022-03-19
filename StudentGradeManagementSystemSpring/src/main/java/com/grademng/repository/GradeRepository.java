package com.grademng.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grademng.entity.Grade;

@Repository
@Transactional
public interface GradeRepository extends JpaRepository<Grade, Long> {

	public Grade findByCourseId(long courseId);
	
	@Modifying
    @Query(value = "SELECT * FROM grade g where (g.student_id IS NULL OR g.student_id=:studentId)\r\n"
    		+ "AND (g.schoolYear IS NULL OR g.schoolYear=:schoolYear)\r\n"
    		+ "AND (g.courseId IS NULL OR g.courseId=:courseId)", nativeQuery = true)
    public List<Grade> studentGrades(@Param("studentId") long studentId, 
    								 @Param("schoolYear") int schoolYear,
    								 @Param("courseId") long courseId);
	
	@Modifying
    @Query(value = "SELECT * FROM grade g where\r\n"
    		+ "(g.schoolYear IS NULL OR g.schoolYear=:schoolYear)\r\n"
    		+ "AND (g.courseId IS NULL OR g.courseId=:courseId)", nativeQuery = true)
    public List<Grade> allStudentGrades(@Param("schoolYear") int schoolYear,
    								 @Param("courseId") long courseId);
}
