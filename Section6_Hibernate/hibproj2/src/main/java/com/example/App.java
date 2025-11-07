package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop l1 = new Laptop();
        l1.setId(1);
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Navin");
        a1.setTech("Java");
        a1.setLaptop(l1);

        // Configuration cfg = new Configuration();
        // cfg.addAnnotatedClass(com.example.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration()
        .addAnnotatedClass(com.example.Alien.class)
        .addAnnotatedClass(com.example.Laptop.class)
        .configure()
        .buildSessionFactory();

        //From hibernate
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(a1);
        // session.persist(s1);

        transaction.commit();

        Alien a2 = session.get(Alien.class,101);
        System.out.println("a2 is "+a2);

        session.close();
        sf.close();
    }
}
