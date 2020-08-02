package com.utshab.hibernetTut;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        SessionFactory sessionFactory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
        System.out.println(sessionFactory);
    }
}
