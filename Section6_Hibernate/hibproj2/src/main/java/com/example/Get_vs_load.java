package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Get_vs_load {
    public static void main( String[] args )
    {
        

        SessionFactory sf = new Configuration()
        // .addAnnotatedClass(com.example.Alien.class)
        .addAnnotatedClass(com.example.Laptop.class)
        .configure()
        .buildSessionFactory();

        //From hibernate
        Session session = sf.openSession();

        // Laptop laptop = session.get(Laptop.class, 2); //by default it is eager loading. sql query select fires immediately
        // System.out.println(laptop.getClass());

        // Laptop laptop = session.load(Laptop.class, 2); 
        Laptop laptop = session.byId(Laptop.class).getReference(2);  //alternative to laod method
        System.out.println(laptop.getBrand());

        session.close();

        sf.close();
    }
}
