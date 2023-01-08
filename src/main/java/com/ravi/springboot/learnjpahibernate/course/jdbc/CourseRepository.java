package com.ravi.springboot.learnjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ravi.springboot.learnjpahibernate.course.Course;

@Repository
public class CourseRepository {
	
	@Autowired
	public JdbcTemplate springJdbcTemplate;
	
	public static String INSERT_QUERY = 
			"""
				insert into COURSE (id,name,author) values (?,?,?);
			""";
	
	public static String DELETE_QUERY = 
			"""
				DELETE FROM COURSE WHERE id = ?;
			""";
	
	public static String SELECT_QUERY = 
			"""
				SELECT * FROM COURSE WHERE id = ?;
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());

	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
	}

}
