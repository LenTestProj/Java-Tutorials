package com.telecom;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;

    private Computer com;
    
    public Alien(){
        // System.out.println("Object Created");
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

    public void setCom(Computer com) {
        this.com = com;
    }
}
