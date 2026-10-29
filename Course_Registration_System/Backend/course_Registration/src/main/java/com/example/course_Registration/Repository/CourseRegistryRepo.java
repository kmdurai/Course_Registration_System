package com.example.course_Registration.Repository;

import com.example.course_Registration.Model.Course_Registry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<Course_Registry,Integer> {
}
