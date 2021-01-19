package Practica.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import lombok.Getter;

public class HibernateUtil {

    @Getter
    private static Session session;

    private HibernateUtil() {

    }

    public static void setUp() throws Exception{

        if (session == null) {
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory(
                new StandardServiceRegistryBuilder().configure().build());

            session = sessionFactory.openSession();
            session.createQuery("select e from cliente");

            
            
        }
        
    }

    public static void shutDown() {
        session.close();
        
    }

}
