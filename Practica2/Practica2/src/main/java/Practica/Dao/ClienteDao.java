package Practica.Dao;

import java.util.*;
import org.hibernate.Session;
import Practica.HibernateUtil.HibernateUtil;
import Practica.ModelClass.Cliente;
import Practica.Utilidades.Leer;

public class ClienteDAO implements Dao<Cliente> {

    @Override
    public Optional<Cliente> get(long id) {

        return null;
    }

    @Override
    public List<Cliente> getAll() {

        return null;
    }

    @Override
    public void save(Cliente t) throws Exception {
        Session srf = HibernateUtil.setUp();

        try {

            srf.beginTransaction();
            srf.save(t);
            srf.getTransaction().commit();

        } catch (Exception e) {
           
        }

    }

    @Override
    public void update(Cliente t, String[] params) {

    }

    @Override
    public void delete(Cliente t) {

    }

}
