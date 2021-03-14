package Practica;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;

import Practica.Detalles_pedido;

public class DetallesDAO implements Dao<Detalles_pedido> {
    private Session session;

    @Override
    public Optional<Detalles_pedido> get(long id) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(session.get(Detalles_pedido.class, id));
    }

    @Override
    public List<Detalles_pedido> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Detalles_pedido t) throws Exception {
        try {

            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    @Override
    public void update(Detalles_pedido t, String[] params) {
        session.update(t);
        session.getTransaction().commit();

    }

    @Override
    public void delete(Detalles_pedido t) {
        session.remove(t);

    }

}
