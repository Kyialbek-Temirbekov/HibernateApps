package org.example;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

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

//            List<Person> people = session.createQuery("FROM Person").getResultList();
//            List<Person> people = session.createQuery("FROM Person where age > 30").getResultList();
//            List<Person> people = session.createQuery("FROM Person where name LIKE 'R%'").getResultList();
//            session.createQuery("update Person set name = 'Test' where age < 30").executeUpdate();
//            session.createQuery("delete from Person where age < 30").executeUpdate();
//
//            List<Person> people = session.createQuery("FROM Person").getResultList();
//            people.forEach(System.out::println);
            Person person = session.get(Person.class, 2);
            System.out.println(person);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
