package com.telecom.spring_data_rest_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.spring_data_rest_demo.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {
    
}
