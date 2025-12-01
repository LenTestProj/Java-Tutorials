package com.telecom.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.JobApp.model.JobPost;
import com.telecom.JobApp.repo.JobRepo;

@Service
public class JobService {
    
    @Autowired
    private JobRepo repo;
    
    public void addJob(JobPost job){
        repo.addJob(job);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
