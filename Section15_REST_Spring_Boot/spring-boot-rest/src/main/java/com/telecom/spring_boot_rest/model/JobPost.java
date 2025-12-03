package com.telecom.spring_boot_rest.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok dependency in pom file makes the code shorter
@Data //creates getter and setter
@NoArgsConstructor //creates default constructor
@AllArgsConstructor //creates all arguments constructor
@Component //to be used in other classes
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
