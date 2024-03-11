package org.example;

import org.example.model.Item;
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
        Configuration configuration =
                new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            READ

//            Person person = session.get(Person.class, 3);
//            System.out.println(person);
//
//            List<Item> itemList = person.getItemList();
//            System.out.println(itemList);

//            Item item = session.get(Item.class, 1);
//            System.out.println(item);
//
//            Person person = item.getOwner();
//            System.out.println(person);

//            CREATE

//            Person person = session.get(Person.class, 1);
//            Item newItem = new Item("Item from Hibernate", person);
//
//            person.getItemList().add(newItem);
//
//            session.save(newItem);

//            Person person = new Person("Bob", 33);
//            Item item = new Item("Bag", person);
//            person.setItemList(new ArrayList<>(Collections.singletonList(item)));
//
//            session.save(person);
//            session.save(item);

//            DELETE

//            Person person = session.get(Person.class, 1);
//            List<Item> itemList = person.getItemList();
//
//            itemList.forEach(session::remove);
//            person.getItemList().clear();

//            Person person = session.get(Person.class, 2);
//            session.remove(person);
//
//            person.getItemList().forEach(item -> item.setOwner(null));

//            UPDATE

//            Person person = session.get(Person.class, 4);
//            Item item = session.get(Item.class, 5);
//
//            item.getOwner().getItemList().remove(item);
//
//            item.setOwner(person);
//            person.getItemList().add(item);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
