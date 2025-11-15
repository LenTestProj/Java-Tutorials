package com.telecom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        try { 
            Alien obj1 = (Alien) context.getBean("alien");
            // obj1.age=21;
            System.out.println(obj1.getAge());
            obj1.code();

            // Alien obj2 = (Alien) context.getBean("alien");
            // System.out.println(obj2.age);
            // obj2.code();  
            
            Desktop obj = (Desktop) context.getBean("com");
        } catch (Exception e) {
           System.out.println("The Error ocuured is: "+e.getMessage());
        }
        finally{
            ((ConfigurableApplicationContext)context).close();
        }
    }
}
