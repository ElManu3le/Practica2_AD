package Practica.ModelClass;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cliente")

public class Cliente {

    @Id
    @Column(name = "codigo_cliente")
    private Integer codigoCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "nombre_contacto")
    private String nombreContacto;

    @Column(name = "apellido_contacto")
    private String apellidoContacto;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fax")
    private String fax;

    @Column(name = "linea_direccion1")
    private String lineaDireccion1;

    @Column(name = "linea_direccion2")
    private String lineaDireccion2;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "region")
    private String region;

    @Column(name = "pais")
    private String pais;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "codigo_empleado_rep_ventas")
    private Integer codigoEmpleadoPepVentas;

    @Column(name = "limite_credito")
    private BigDecimal limiteCredito;

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", nombreCliente='" + nombreCliente + '\''
                + ", nombreContacto='" + nombreContacto + '\'' + ", apellidoContacto='" + apellidoContacto + '\''
                + ", telefono='" + telefono + '\'' + ", fax='" + fax + '\'' + ", lineaDireccion1='" + lineaDireccion1
                + '\'' + ", lineaDireccion2='" + lineaDireccion2 + '\'' + ", ciudad='" + ciudad + '\'' + ", region='"
                + region + '\'' + ", pais='" + pais + '\'' + ", codigoPostal='" + codigoPostal + '\''
                + ", codigoEmpleadoPepVentas=" + codigoEmpleadoPepVentas + ", limiteCredito=" + limiteCredito + '}';
    }
}