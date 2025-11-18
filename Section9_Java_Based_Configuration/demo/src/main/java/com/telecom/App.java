package com.telecom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telecom.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);        

        Alien obj1 = context.getBean(Alien.class);
        // obj1.setAge(21);

        System.out.println(obj1.getAge());
        obj1.code();

        // Desktop dt = context.getBean("desktop",Desktop.class);
        // dt.compile();

        // Desktop dt1 = context.getBean("desktop",Desktop.class);
        // dt1.compile();

        // XML based config
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // try { 
        //     Alien obj1 = (Alien) context.getBean("alien");
        //     // obj1.age=21;
        //     System.out.println(obj1.getAge());
        //     obj1.code();

        //     // Alien obj2 = (Alien) context.getBean("alien");
        //     // System.out.println(obj2.age);
        //     // obj2.code();  
            
        //     Desktop obj = (Desktop) context.getBean("com");
        // } catch (Exception e) {
        //    System.out.println("The Error ocuured is: "+e.getMessage());
        // }
        // finally{
        //     ((ConfigurableApplicationContext)context).close();
        // }
    }
}
