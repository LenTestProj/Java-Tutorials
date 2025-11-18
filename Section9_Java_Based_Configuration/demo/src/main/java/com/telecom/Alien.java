package com.telecom;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //tells this class that it is being used by spring framework
public class Alien {

    @Value("21")
    private int age;

    @Autowired
    @Qualifier("com2")
    private Computer com;
    
    public Alien(){
        // System.out.println("Object Created");
    }

    @Autowired //constructor injection
    public Alien( @Qualifier("com2") Computer com){
        this.com = com;
    }

    // constructor parameters called in different orders
    // @ConstructorProperties({"age","lap"})
    // public Alien(int age, Computer lap) {
    //     this.age = age;
    //     this.lap = lap;
    // }

    // public Alien(int age){
    //     this.age=age;
    //     System.out.println("Parametrized constructor called for alien class");
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        com.compile();
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")  //setter injection //preferred approach
    public void setCom(Computer com) {
        this.com = com;
    }
}
