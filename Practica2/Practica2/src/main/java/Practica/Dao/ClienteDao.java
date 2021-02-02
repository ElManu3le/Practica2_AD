package Practica.Dao;

import java.util.List;
import java.util.Optional;
import org.hibernate.Session;
import Practica.HibernateUtil.HibernateUtil;
import Practica.ModelClass.Cliente;

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



    }

    @Override
    public void update(Cliente t, String[] params) {

    }

    @Override
    public void delete(Cliente t) {

    }

}
