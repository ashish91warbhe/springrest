package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseServiceImpl;
import com.springrest.springrest.services.CourseServices;

@RestController
public class MyController {

@Autowired
private CourseServices courseservice;


@GetMapping("/home")
public String index() {
	return "i am on index";
}

//get the courses
@GetMapping("/courses")
public List<Course> getCourses () {
	
	return this.courseservice.getCourses();
}

//get single course with the help of id
@GetMapping("/courses/{CourseId}")
public Course getCourseId(@PathVariable String CourseId) {
	
	return this.courseservice.getCourses(Long.parseLong(CourseId));
}

@PostMapping("/courses")
public Course addCourse(@RequestBody Course Course) {
	
	return this.courseservice.addCourse(Course);
}

}
