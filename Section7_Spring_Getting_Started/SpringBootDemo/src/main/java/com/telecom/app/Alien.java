package com.telecom.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //tell us the spring will create an object of this class, assemble the object and manage it
public class Alien {
    @Autowired //create object of type Laptop
    Laptop laptop;

    public void code(){
        laptop.compile();
    }
}
