package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Update {
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setsName("Harshit");
        s1.setRollno(107);
        s1.setsAge(24);

        // Configuration cfg = new Configuration();
        // cfg.addAnnotatedClass(com.example.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration().addAnnotatedClass(com.example.Student.class).configure().buildSessionFactory();

        //From hibernate
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        //UPDATE OPERATION
        session.merge(s1);

        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1.getsName());
    }    
}
