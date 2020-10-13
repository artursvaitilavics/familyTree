package main.sample;

import data_base_utilities.DbUtils;
import domains.Person;
import domains.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Application {
    public static void main(String[] args) {
//        Person person001 = new Person(
//                "Janis",
//                "Vaitilavics",
//                "born: 060587"
//        );
//
//        Repository repository = new Repository();
//        repository.create(person001);

        Repository repository = new Repository();
        Person person = repository.retrieveRecord(1);

        System.out.println(person.toString());
    }
}
