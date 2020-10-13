package domains;

import data_base_utilities.DbUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Repository {
    public void createRecord(Person person) {
        Transaction transaction = null;
        try (Session session = DbUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Person retrieveRecord(Integer id) {
        Transaction transaction = null;
        Person person = null;
        try (Session session = DbUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            person = (Person) session.get(Person.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return person;
    }
}
