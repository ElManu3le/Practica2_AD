package Practica.Dao;

import java.util.*;
import org.hibernate.Session;
import Practica.HibernateUtil.HibernateUtil;
import Practica.ModelClass.Cliente;
import Practica.Utilidades.Leer;

public class ClienteDAO implements Dao<Cliente> {
    private Session session;

    // http://chuwiki.chuidiang.org/index.php?title=Ejemplo_sencillo_con_Hibernate

    @Override
    public Optional<Cliente> get(long id) {

        return Optional.ofNullable(session.get(Cliente.class, id));
    }

    @Override
    public List<Cliente> getAll() {

        return null;
    }

    @Override
    public void save(Cliente t) throws Exception {
        // Session srf = HibernateUtil.setUp();

        try {

            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    @Override
    public void update(Cliente t, String[] params) {
        session.update(t);
        session.getTransaction().commit();

    }

    @Override
    public void delete(Cliente t) {
        session.remove(t);

    }

}
