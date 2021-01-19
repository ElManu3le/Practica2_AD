package Practica.Dao;

import Practica.HibernateUtil.HibernateUtil;
import Practica.ModelClass.*;
import java.util.List;
import java.util.Optional;

import org.hibernate.*;

import Practica.ModelClass.Cliente;

public class ClienteDao implements Dao<Cliente> {

    Session srf = HibernateUtil.getSession();

   
    
   
    

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

        
        

    }

    @Override
    public void update(Cliente t, String[] params) {
        

    }

    @Override
    public void delete(Cliente t) {
        

    }
    
}
