package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseServices {

	public List<Course> getCourses();
	
	public Course getCourses(long CourseId);

	public Course addCourse(Course course);
	
}
