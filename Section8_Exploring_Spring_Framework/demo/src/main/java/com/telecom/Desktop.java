package com.telecom;

public class Desktop implements Computer{

    Desktop(){
        System.out.println("Desktop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
    
}
