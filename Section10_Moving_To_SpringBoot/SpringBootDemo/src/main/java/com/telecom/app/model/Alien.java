package com.telecom.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //tell us the spring will create an object of this class, assemble the object and manage it
public class Alien {
    @Value("25")
    private int age;
   
    // @Autowired //create object of type Laptop
    private Computer com;

    public void code(){
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired //create object of type Laptop
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }
}
