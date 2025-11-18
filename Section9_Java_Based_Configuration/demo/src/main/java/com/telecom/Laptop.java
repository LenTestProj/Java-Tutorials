package com.telecom;

import org.springframework.stereotype.Component;

@Component //tells this class that it is being used by spring framework
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
