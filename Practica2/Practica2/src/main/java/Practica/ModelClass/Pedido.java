package Practica.ModelClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")

public class Pedido {

    @Id
    @Column(name = "codigo_producto")
    private String cod_producto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "gamma")
    private String gamma;

    @Column(name = "dimensiones")
    private String dimensiones;

    @Column(name = "proveedor")
    private String proveedor;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidad en stock")
    private String cantStock;

    @Column(name = "precio_venta")
    private float precio_venta;

    @Column(name = "precio_proveedo")
    private float precio_proveedor;

    @Override
    public String toString() {
        return "Pedido [cantStock=" + cantStock 
        + ", cod_producto=" + cod_producto 
        + ", descripcion=" + descripcion
        + ", dimensiones=" + dimensiones 
        + ", gamma=" + gamma 
        + ", nombre=" + nombre 
        + ", precio_proveedor=" + precio_proveedor 
        + ", precio_venta=" + precio_venta 
        + ", proveedor=" + proveedor + "]";
    }

    
    
}
