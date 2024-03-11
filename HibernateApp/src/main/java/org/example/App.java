package org.example;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
//            Person person = session.get(Person.class, 2); // REVIEW

//            Person person = new Person("Sem",21); // CREATE
//            session.save(person);

//            Person person = session.get(Person.class, 4); // UPDATE
//            person.setName("New name");

//            Person person = session.get(Person.class, 4); // DELETE
//            session.delete(person);

            session.getTransaction().commit();

//            System.out.println(person.getId()); // RETRIEVE VALUES AFTER SAVING
        }
        finally {
            sessionFactory.close();
        }
    }
}
