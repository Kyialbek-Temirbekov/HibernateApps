package org.example;

import org.example.model.Principal;
import org.example.model.School;
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
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Principal.class).addAnnotatedClass(School.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

//            Principal principal = session.get(Principal.class, 3);
//            System.out.println(principal);
//            School school = principal.getSchool();
//            System.out.println(school);

//            School school = session.get(School.class, 3);
//            System.out.println(school);
//            Principal principal = school.getPrincipal();
//            System.out.println(principal);

//            Principal principal = new Principal("Ben", 44);
//            School school = new School(121);
//            principal.setSchool(school);
//            session.save(principal);

//            School school = session.get(School.class, 5);
//            Principal principal = new Principal("Gaby", 25);
//            session.save(principal);
//            principal.setSchool(school);

            // Fail
            Principal principal = session.get(Principal.class, 1);
            principal.getSchool().setPrincipal(null);

            session.getTransaction().commit();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            principal = session.get(Principal.class, 1);
            School school = session.get(School.class, 11);
            principal.setSchool(school);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
