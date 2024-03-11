package org.example;

import org.example.model.Actor;
import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Actor.class).addAnnotatedClass(Movie.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            Movie movie = new Movie("Shrek 2", 2011);
//            Actor actor1 = new Actor("Puss in boots", 15);
//            Actor actor2 = new Actor("Shrek", 34);
//
//            movie.setActors(new ArrayList<>(List.of(actor2, actor1)));
//            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//
//            session.save(movie);
//            session.save(actor1);
//            session.save(actor2);

//            Movie movie = session.get(Movie.class, 1);
//            System.out.println(movie.getActors());

//            Actor actor = session.get(Actor.class, 2);
//            System.out.println(actor.getMovies());

//            Movie movie = new Movie("Titanic", 1933);
//            Actor actor = session.get(Actor.class, 1);
//            movie.setActors(new ArrayList<>(Collections.singletonList(actor)));
//            actor.getMovies().add(movie);
//            session.save(movie);



            session.getTransaction().commit();
        }

    }
}
