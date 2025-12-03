package com.telecom.spring_data_jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.telecom.spring_data_jpa.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>  {
    
    //the query is optioal
    // @Query("select s from Student s where s.name = :name")  //? will be replaced by first parameter i.e. name

    //this methods are created by JPA behind the scenes
    List<Student> findByName(String name);
    List<Student> findByMarks(int marks);
    List<Student> findByMarksGreaterThan(int marks);


}
