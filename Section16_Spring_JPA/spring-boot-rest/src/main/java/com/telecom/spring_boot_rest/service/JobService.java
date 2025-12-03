package com.telecom.spring_boot_rest.service;

import java.util.ArrayList;
import java.util.Arrays;
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
        return repo.save(job);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                    new JobPost(1, "Java Developer","Must have good experience in core java",1,Arrays.asList("Java")),    
                    new JobPost(2, "Frontend Developer","Must have good experience in front end roles",1,Arrays.asList("Java")),
                    new JobPost(3, "Data Scientist","Must have good experience in core machine learning",1,Arrays.asList("Java")),
                    new JobPost(4, "Network Engineer","Must have good experience in networking",1,Arrays.asList("Java")),
                    new JobPost(5, "Mobile App Developer","Must have good experience in building mobile apps",1,Arrays.asList("Java"))                
                ));

                repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
       return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
