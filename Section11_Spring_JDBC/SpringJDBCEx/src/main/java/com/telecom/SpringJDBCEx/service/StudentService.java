package com.telecom.SpringJDBCEx.service;

import org.springframework.stereotype.Service;

import com.telecom.SpringJDBCEx.model.Student;
import com.telecom.SpringJDBCEx.repo.StudentRepo;

@Service
public class StudentService {
    private StudentRepo repo;
    
    public StudentRepo getRepo() {
        return repo;
    }

    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){
        repo.sa
    }
}
