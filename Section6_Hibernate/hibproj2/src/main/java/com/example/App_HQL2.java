package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App_HQL2 {
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
        
        String brand = "Asus";

        // Query query = session.createQuery("from Laptop"); //gets all the alptop records
        // Query<Laptop> query = session.createQuery("from Laptop where brand like ?1",com.example.Laptop.class);
        // query.setParameter(1, brand);

        Query<Object[]> query = session.createQuery("select brand, model from Laptop where brand like ?1",Object[].class);
        query.setParameter(1, brand);
        
        List<Object[]> laptops = query.getResultList();

        // Laptop l1 = session.get(Laptop.class, 3);
        for(Object[] data:laptops){
            System.out.println((String)data[0] + ":" + (String)data[1]);
        }

        System.out.println(laptops);
        session.close();

        sf.close();
    }
}
