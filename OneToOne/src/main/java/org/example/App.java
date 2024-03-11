package org.example;

import org.example.model.Passport;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.Period;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

//            Person person = new Person("Sunday",30);
//            Passport passport = new Passport(1234);
//            person.setPassport(passport);
//            session.save(person);

//            Person person = session.get(Person.class, 9);
//            System.out.println(person.getPassport().getPassportNumber());

//            Passport passport = session.get(Passport.class, 1);
//            System.out.println(passport.getPerson().getName());

//            Person person = session.get(Person.class, 10);
//            person.getPassport().setPassportNumber(77777);
//            session.remove(person);



            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
