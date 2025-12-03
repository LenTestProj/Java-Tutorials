package com.telecom.spring_boot_rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telecom.spring_boot_rest.model.JobPost;
import com.telecom.spring_boot_rest.service.JobService;

public class JobRestController_2 {
    
    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    @ResponseBody 
    public List<JobPost> getAllJobs(){
        return service.getAllJobs(); //by default controller searches for a view to return data. we ned to tell the controller to return data not view
    }
}
