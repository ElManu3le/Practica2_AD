package Practica;

import java.util.*;
import org.hibernate.Session;
import Practica.HibernateUtil;
import Practica.Cliente;
import Practica.Leer;

public class ClienteDAO implements Dao<Cliente> {

    Cliente clienteDAO = new Cliente();
    Session session;

    // http://chuwiki.chuidiang.org/index.php?title=Ejemplo_sencillo_con_Hibernate

    @Override
    public Optional<Cliente> get(long id) {

        return Optional.ofNullable(session.get(Cliente.class, id));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Cliente> getAll() {

        return session.createQuery("from Cliente").list();
    }

    @Override
    public void save(Cliente t) throws Exception {
        session = HibernateUtil.setUp();

        System.out.println("Codigo de cliente nuevo");
        int codigo_cliente = Leer.pedirEnteroValidar();/**
                                                        * el .pediCadena no hara falta hacer un Scanner teclado= new
                                                        * Scanner(Sysmten.in) ya que ya te piede una cadena ó int
                                                        */

        System.out.println("Dime el nombre del nuevo cliente");
        String nombre_cliente = Leer.pedirCadena();

        System.out.println("Dime el nombre del nuevo contacto");
        String nombre_contacto = Leer.pedirCadena();

        System.out.println("Dime el apllido del nuevo contacto");
        String apellido_contacto = Leer.pedirCadena();

        System.out.println("Dime el telefono");
        String telefono = Leer.pedirCadena();

        System.out.println("Dime el fax");
        String fax = Leer.pedirCadena();

        System.out.println("Dime la dirreción del cliente");
        String direccion1 = Leer.pedirCadena();

        System.out.println("Dime la ciudad");
        String ciudad = Leer.pedirCadena();

        System.out.println("Dime la region del cliente");
        String region = Leer.pedirCadena();

        System.out.println("Dime el pais del cliente");
        String pais = Leer.pedirCadena();

        System.out.println("Dime el codigo postal cliente");
        String codigo_postal = Leer.pedirCadena();

        clienteDAO.setCodigoCliente(codigo_cliente);
        clienteDAO.setNombreCliente(nombre_cliente);
        clienteDAO.setNombreContacto(nombre_contacto);
        clienteDAO.setApellidoContacto(apellido_contacto);
        clienteDAO.setTelefono(telefono);
        clienteDAO.setFax(fax);
        clienteDAO.setLineaDireccion1(direccion1);
        clienteDAO.setCiudad(ciudad);
        clienteDAO.setRegion(region);
        clienteDAO.setPais(pais);
        clienteDAO.setCodigoPostal(codigo_postal);

        session.getTransaction().begin();
        session.persist(clienteDAO);
        session.getTransaction().commit();

    }

    @Override
    public void update(Cliente t, String[] params) {

    }

    @Override
    public void delete(Cliente t) {

    }

}
