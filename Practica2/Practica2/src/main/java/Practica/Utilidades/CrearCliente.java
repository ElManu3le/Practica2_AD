package Practica.Utilidades;

import java.util.*;

import Practica.ModelClass.Cliente;

/** Esta clase servira para crear todo puto cliente nuevo */
public class CrearCliente {

    /** Este te va a devolver un cliente; piede datos y te los devuelve */
    public static Cliente newcliente() {
        Cliente sujetonuevo = new Cliente();

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

        sujetonuevo.setCodigoCliente(codigo_cliente);
        sujetonuevo.setNombreCliente(nombre_cliente);
        sujetonuevo.setNombreContacto(nombre_contacto);
        sujetonuevo.setApellidoContacto(apellido_contacto);
        sujetonuevo.setTelefono(telefono);
        sujetonuevo.setFax(fax);
        sujetonuevo.setLineaDireccion1(direccion1);
        sujetonuevo.setCiudad(ciudad);
        sujetonuevo.setRegion(region);
        sujetonuevo.setPais(pais);
        sujetonuevo.setCodigoPostal(codigo_postal);

        return null;
    }

}
