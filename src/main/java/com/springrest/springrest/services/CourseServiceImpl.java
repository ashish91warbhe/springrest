package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseServices {

	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		
		//adding data to the list collection object
		list.add(new Course(55,"java","java is a evergreen language"));
		list.add(new Course(56,"php","php is a evergreen language"));
	
	}
	
	@Override
	public List<Course> getCourses() {
	
		return list;
	}

	@Override
	public Course getCourses(long CourseId) {
		
		Course c=null;
		for(Course Course:list) {
			if(Course.getId()==CourseId) {
				c=Course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	
	
	
	

}
