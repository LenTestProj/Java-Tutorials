package com.telecom.app;

import org.springframework.stereotype.Repository;

import com.telecom.app.model.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in database");
    }
}
