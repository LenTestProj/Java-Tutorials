package com.telecom.spring_boot_rest.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.spring_boot_rest.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}


// public class JobRepo {
//     List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//         new JobPost(1, "Java Developer","Must have good experience in core java",1,Arrays.asList("Java")),    
//         new JobPost(2, "Frontend Developer","Must have good experience in front end roles",1,Arrays.asList("Java")),
//         new JobPost(3, "Data Scientist","Must have good experience in core machine learning",1,Arrays.asList("Java")),
//         new JobPost(4, "Network Engineer","Must have good experience in networking",1,Arrays.asList("Java")),
//         new JobPost(5, "Mobile App Developer","Must have good experience in building mobile apps",1,Arrays.asList("Java"))                
//     ));
    
//     public List<JobPost> getAllJobs(){
//         return jobs;
//     }

//     public JobPost addJob(JobPost job){
//         jobs.add(job);
//         System.out.println(jobs);
//         return job;
//     }

//     public JobPost getJob(int postId) {
//         for(JobPost job : jobs){
//             if(job.getPostId() == postId){
//                 return job;
//             }
//         }

//         return null;
//     }

//     public void updateJob(JobPost jobPost) {
//         for(JobPost jobPost1:jobs){
//             if(jobPost1.getPostId() == jobPost.getPostId()){
//                 jobPost1.setPostProfile(jobPost.getPostProfile());
//                 jobPost1.setPostDesc(jobPost.getPostDesc());
//                 jobPost1.setReqExperience(jobPost.getReqExperience());
//                 jobPost1.setPostTechStack(jobPost.getPostTechStack());
//             }
//         }
//     }

//     public void deleteJob(int postId) {
//         for(JobPost jobPost:jobs){
//             if(jobPost.getPostId() == postId){
//                 jobs.remove(postId);
//             }
//         }
//     }
// }