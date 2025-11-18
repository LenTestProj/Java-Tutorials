package com.telecom;

import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com2") //tells this class that it is being used by spring framework
// @Primary 
@Scope("prototype")
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
    
}
