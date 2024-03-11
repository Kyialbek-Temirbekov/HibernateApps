package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.example.models.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDao {
    private final EntityManager entityManager;
    @Autowired
    public PersonDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void testNPlus1() {
        Session session = entityManager.unwrap(Session.class);

//        List<Person> people = session.createQuery("select p from Person p",Person.class)
//                .getResultList();
//        people.forEach(person -> System.out.println(person.getName() + " has " + person.getItems()));

        List<Person> people = session.createQuery("select p from Person p LEFT JOIN FETCH p.items",
                Person.class).getResultList();
        people.forEach(person -> System.out.println(person.getName() + " has " + person.getItems()));
    }
}
