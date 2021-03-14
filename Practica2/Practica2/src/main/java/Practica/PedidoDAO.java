package Practica;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;

public class PedidoDAO implements Dao<Pedido> {

    private Session session;

    @Override
    public Optional<Pedido> get(long id) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(session.get(Pedido.class, id));
    }

    @Override
    public List<Pedido> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Pedido t) throws Exception {
        try {

            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    @Override
    public void update(Pedido t, String[] params) {
        session.update(t);
        session.getTransaction().commit();

    }

    @Override
    public void delete(Pedido t) {
        session.remove(t);

    }

}
