package com.example.course_Registration.Service;

import com.example.course_Registration.Model.Course;
import com.example.course_Registration.Model.Course_Registry;
import com.example.course_Registration.Repository.CourseRegistryRepo;
import com.example.course_Registration.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistry;

    public List<Course> getCourse(){
        return courseRepo.findAll();

    }

    public List<Course_Registry> enrolledStudents(){
        return courseRegistry.findAll();
    }

    public void registerCourse(String name,String emailId,String courseName){
        Course_Registry course_registry=new Course_Registry(name,emailId,courseName);
        courseRegistry.save(course_registry);

    }
}
