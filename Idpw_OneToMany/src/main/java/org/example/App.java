package org.example;

import org.example.model.Director;
import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Director.class).addAnnotatedClass(Movie.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

//            Director director = session.get(Director.class, 1);
//            System.out.println(director);
//            List<Movie> movies = director.getMovies();
//            System.out.println(movies);

//            Movie movie = session.get(Movie.class, 11);
//            System.out.println(movie);
//            Director director = movie.getDirector();
//            System.out.println(director);

//            Director director = session.get(Director.class, 6);
//            Movie movie = new Movie("Titanic", 1982, director);
//            director.getMovies().add(movie);
//            session.save(movie);

//            Director director = new Director("Holan", 55);
//            Movie movie = new Movie("Interstellar", 2022, director);
//            director.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            session.save(director);
//            session.save(movie);

//            Director director = session.get(Director.class, 7);
//            Movie movie = session.get(Movie.class, 1);
//            movie.getDirector().getMovies().remove(movie);
//            movie.setDirector(director);
//            director.getMovies().add(movie);

            Movie movie = session.get(Movie.class, 1);
            Director director = movie.getDirector();
            director.getMovies().remove(movie);
            session.remove(movie);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
