package com.example;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setsName("Navin");
        s1.setRollno(101);
        s1.setsAge(30);

        // Create registry
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure("hibernate.cfg.xml") // by default looks for hibernate.cfg.xml in classpath
            .build();

        // Create MetadataSources
        MetadataSources sources = new MetadataSources(registry);

        // Create Metadata
        Metadata metadata = sources.getMetadataBuilder().build();
        
        SessionFactory sf = metadata.getSessionFactoryBuilder().build();

        // Configuration cfg = new Configuration();

        //From hibernate
        Session session = sf.openSession();

        session.save(s1);

        System.out.println(s1);
    }
}
