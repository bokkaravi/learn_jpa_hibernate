package com.ravi.springboot.learnjpahibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.springboot.learnjpahibernate.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {
	public List<Course> findByAuthor(String author);
	public List<Course> findByName(String courseName);
}
