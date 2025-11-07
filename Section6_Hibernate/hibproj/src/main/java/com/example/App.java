package com.example;

// import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setsName("Gaurav");
        s1.setRollno(105);
        s1.setsAge(22);

        // Create registry
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure("hibernate.cfg.xml") // by default looks for hibernate.cfg.xml in classpath
            .build();

        // Create MetadataSources
        MetadataSources sources = new MetadataSources(registry);
        sources.addAnnotatedClass(com.example.Student.class);

        // Create Metadata
        Metadata metadata = sources.getMetadataBuilder().build();
        
        SessionFactory sf = metadata.getSessionFactoryBuilder().build();

        // Configuration cfg = new Configuration();

        //From hibernate
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
}
