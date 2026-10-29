package com.example.course_Registration.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Entity
public class Course {

    @Id
    private int courseID;
    private String courseName;
    private String Trainer;
    private int DurationInWeeks;




}
