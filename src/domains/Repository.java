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
            transactionException(transaction, e);
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
            transactionException(transaction, e);
        }
        return person;
    }

    public void updateRecord(Person person) {
        Transaction transaction = null;
        try (Session session = DbUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(person);
            transaction.commit();
        } catch (Exception e) {
            transactionException(transaction, e);
        }
    }

    private void transactionException(Transaction transaction, Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
    }
}
