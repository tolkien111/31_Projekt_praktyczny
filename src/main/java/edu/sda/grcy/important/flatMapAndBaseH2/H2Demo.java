package edu.sda.grcy.important.flatMapAndBaseH2;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class H2Demo {

    final static Logger LOGGER = Logger.getLogger(H2Demo.class);

    public static void main(String[] args) {
        LOGGER.info("Start programu");

        LOGGER.debug("Debug message");
        LOGGER.trace("Trace message");
        LOGGER.error("Error message");
        LOGGER.warn("Warning message");
        LOGGER.fatal("Fatal message");

        Pesel pesel1 = Pesel.createPesel("111");
        Pesel pesel2 = Pesel.createPesel("222");
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(pesel1);
            session.save(pesel2);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Pesel> peselList = session.createQuery("from Pesel", Pesel.class).list();
            peselList.forEach(s -> System.out.println(s.getPeselNumber()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        HibernateUtil.getSessionFactory().close();
    }
}
