package com.grademng.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.grademng.entity.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findAll();
	
	public Student findByName(String name);
	
	/*@Modifying
    @Query(value = "insert into Students (name,courses) values (:name,:courses)", nativeQuery = true)
    public int addStudent(@Param("name") String name, @Param("courses") List<String> courses);
	
	@Modifying
	@Query(value="update Students set courses=:courseId", nativeQuery=true)
	public void addCourse(@Param("courseId") int courseId);*/
}
