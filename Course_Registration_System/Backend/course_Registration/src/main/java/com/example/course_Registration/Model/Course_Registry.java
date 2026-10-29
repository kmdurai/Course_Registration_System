package com.example.course_Registration.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Course_Registry {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String courseName;

    public Course_Registry(String name,String emailId,String courseName){
        this.name=name;
        this.emailId=emailId;
        this.courseName=courseName;
    }

    public Course_Registry(){

    }


}
