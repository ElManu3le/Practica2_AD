package Practica.Dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;

import Practica.ModelClass.Producto;

public class ProductoDAO implements Dao<Producto> {

    private Session session;

    @Override
    public Optional<Producto> get(long id) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(session.get(Producto.class, id));
    }

    @Override
    public List<Producto> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Producto t) throws Exception {
        try {

            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    @Override
    public void update(Producto t, String[] params) {
        session.update(t);
        session.getTransaction().commit();

    }

    @Override
    public void delete(Producto t) {
        session.remove(t);

    }

}
