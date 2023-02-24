package com.spring.restapi.service;

import com.spring.restapi.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
public List<Course> list;
public CourseServiceImpl(){
    list = new ArrayList<>();
    list.add(new Course(140,"core java","it is collection of basic java concept"));
    list.add(new Course(141,"Advance java","it is collection of Advance java concept"));
    list.add(new Course(142,"Spring java","it is Spring frame work"));
}

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
