package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App_HQL {
    public static void main( String[] args )
    {
        // Laptop l1 = new Laptop();
        // l1.setId(4);
        // l1.setBrand("Asus");
        // l1.setModel("Strix");
        // l1.setRam(32);

        
        // Configuration cfg = new Configuration();
        // cfg.addAnnotatedClass(com.example.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration()
        // .addAnnotatedClass(com.example.Alien.class)
        .addAnnotatedClass(com.example.Laptop.class)
        .configure()
        .buildSessionFactory();

        //From hibernate
        Session session = sf.openSession();

        // Transaction transaction = session.beginTransaction();

        // session.persist(l1);

        // transaction.commit();

        // Alien a5 = session.get(Alien.class,101);
        // System.out.println("a5 is "+a5);

        //select * from laptop where ram=32 -> SQL
        // from Laptop where ram=32
        
        // Query query = session.createQuery("from Laptop"); //gets all the alptop records
        Query<Laptop> query = session.createQuery("from Laptop where ram=32",com.example.Laptop.class);
        List<Laptop> laptops = query.getResultList();

        // Laptop l1 = session.get(Laptop.class, 3);

        System.out.println(laptops);
        session.close();

        sf.close();
    }
}
