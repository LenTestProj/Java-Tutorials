package com.telecom.JobApp.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.telecom.JobApp.model.JobPost;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(1, "Java Developer","Must have good experience in core java",1,Arrays.asList("Java")),    
        new JobPost(2, "Frontend Developer","Must have good experience in front end roles",1,Arrays.asList("Java")),
        new JobPost(3, "Data Scientist","Must have good experience in core machine learning",1,Arrays.asList("Java")),
        new JobPost(4, "Network Engineer","Must have good experience in networking",1,Arrays.asList("Java")),
        new JobPost(5, "Mobile App Developer","Must have good experience in building mobile apps",1,Arrays.asList("Java"))                
    ));
    
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }
}
