package edu.sda.grcy.important.flatMapAndBaseH2;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Slf4j
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {



        if (sessionFactory == null) {
            // SessionFactory in Hibernate 5 example
            Configuration config = new Configuration();
            config.configure();
            // local SessionFactory bean created
            sessionFactory = config.buildSessionFactory();
        }
        return sessionFactory;
    }
}
