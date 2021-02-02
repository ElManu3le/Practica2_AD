package Practica;

import java.sql.Connection;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;

import Practica.HibernateUtil.HibernateUtil;
import Practica.Utilidades.CrearCliente;

public class App {
    public static void main(String[] args) throws Exception {
        HibernateUtil.setUp();
        CrearCliente.newcliente();
    }
}
