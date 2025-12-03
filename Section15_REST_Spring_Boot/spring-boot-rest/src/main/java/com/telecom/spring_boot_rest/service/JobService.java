package com.telecom.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.spring_boot_rest.model.JobPost;
import com.telecom.spring_boot_rest.repo.JobRepo;

@Service
public class JobService {
    
    @Autowired
    private JobRepo repo;
    
    public JobPost addJob(JobPost job){
        return repo.addJob(job);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
