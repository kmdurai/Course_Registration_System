package com.example.course_Registration.Controller;

import com.example.course_Registration.Model.Course;
import com.example.course_Registration.Model.Course_Registry;
import com.example.course_Registration.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return courseService.getCourse();
    }


    @GetMapping("/courses/enrolledStudents")
    public List<Course_Registry> enrolledStudents(){
        return courseService.enrolledStudents();
    }


    @PostMapping("/courses/register")
    public String registerCourse(@RequestParam String name,
                                 @RequestParam String emailId,
                                 @RequestParam String courseName){

         courseService.registerCourse(name,emailId,courseName);
         return "Congrats "+name+" you Successfully enrolled "+courseName+" !!";


    }

}
