package com.telecom.spring_security_demo.dao;

import com.telecom.spring_security_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepo extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}
