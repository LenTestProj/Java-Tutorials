package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App_Get {
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setsName("Dale");
        s1.setRollno(106);
        s1.setsAge(30);

        Student s2 = null;

        // Configuration cfg = new Configuration();
        // cfg.addAnnotatedClass(com.example.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration().addAnnotatedClass(com.example.Student.class).configure().buildSessionFactory();

        // Configuration cfg = new Configuration();

        //From hibernate
        Session session = sf.openSession();
        s2 = session.get(Student.class,109);

        // Transaction transaction = session.beginTransaction();

        // session.persist(s1);

        // transaction.commit();
        session.close();
        sf.close();

        System.out.println(s2.getsName());
    }
}
