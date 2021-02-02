package Practica.ModelClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class Detalles_pedido {

    @Id
    @Column(name = "codigo_pedido")
    private int cod_pedido;

    @Column(name = "codigo_pedido")
    private String cod_producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio_unidad")
    private float udcost;

    @Column(name = "numero_linea")
    private int numlinea;

    @Override
    public String toString() {
        return "Detalles_pedido [cantidad=" + cantidad +
         ", cod_pedido=" + cod_pedido +
         ", cod_producto=" + cod_producto + 
         ", numlinea=" + numlinea + 
         ", udcost=" + udcost + "]";
    }

    

}
