package main.sample;

import data_base_utilities.DbUtils;
import domains.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Application {
    public static void main(String[] args) {
        Person person001 = new Person(
                "Arturs",
                "Vaitilavics",
                "born: 030587"
        );

        Transaction transaction = null;

        try (Session session =
                     DbUtils.getSessionFactory().openSession()){
            transaction = session.beginTransaction();

            session.save(person001);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
