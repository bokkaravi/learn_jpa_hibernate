package com.ravi.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ravi.springboot.learnjpahibernate.course.Course;
import com.ravi.springboot.learnjpahibernate.course.jdbc.CourseRepository;
import com.ravi.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.ravi.springboot.learnjpahibernate.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class SpringCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	CourseRepository repository;
	
	@Autowired
	CourseJpaRepository jpaRepository;
	
	@Autowired
	CourseSpringDataJPARepository  springdatajpaRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//JPA REPOSITORY//
		
		jpaRepository.insert(new Course(1,"spring jpa","ravi"));
		jpaRepository.insert(new Course(2,"spring jpa","sai"));
		jpaRepository.insert(new Course(3,"spring jpa","ganesh"));
		
		
		jpaRepository.deleteById(1);
		
		System.out.println(jpaRepository.findById(2));
		System.out.println(jpaRepository.findById(3));
		
		
		//Spring Data JPA REPOSITORY
//		springdatajpaRepository.save(new Course(1,"spring data jpa","ravi"));
//		springdatajpaRepository.save(new Course(2,"AWS","sai"));
//		springdatajpaRepository.save(new Course(3,"Devops","prakash"));
//		springdatajpaRepository.save(new Course(4,"micorservices","ganesh"));
		
//		springdatajpaRepository.deleteById(1l);
//		
//		System.out.println(springdatajpaRepository.findById(2l));
//		System.out.println(springdatajpaRepository.findById(3l));
//		
//		System.out.println(springdatajpaRepository.findAll());
//		System.out.println(springdatajpaRepository.count());
//		
//		System.out.println(springdatajpaRepository.findByAuthor("sai")); //it is like user defined method 
//		
//		System.out.println(springdatajpaRepository.findByName("Devops"));
		
		
		
	}

}
