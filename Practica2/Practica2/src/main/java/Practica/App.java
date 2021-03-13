package Practica;

import Practica.Dao.ClienteDAO;
import Practica.Dao.DetallesDAO;
import Practica.Dao.ProductoDAO;
import Practica.ModelClass.Cliente;
import Practica.ModelClass.Producto;
import Practica.Utilidades.Leer;

public class App {
    public static void main(String[] args) throws Exception {

        int opcion = 0;
        ClienteDAO mCliente = new ClienteDAO();
        Cliente cliente = new Cliente();

        ProductoDAO mProducto = new ProductoDAO();
        Producto producto = new Producto();

        DetallesDAO mDetalles = new DetallesDAO();

        

        do {

            System.out.println("1-Añadir a un cliente\n" 
                + "2-Mostrar a un cliente (Usar el ID del cliente) \n"
                + "3-Mostrar todos los clientes \n" 
                + "4-Buscar a un cliente \n"
                + "5-Editar/Actualizar un producto \n"
                + "6-Muestra todos los detalles de los pedidos de un Cliente \n "
                + "7-Muestra al empleado del mes (no operativo) \n " 
                + "0-Para salir");
                opcion = Leer.pedirEnteroValidar();

            switch (opcion) {
            case 1:

                try {

                    mCliente.save(cliente);
                    System.out.println("Cliente guardado: " + mCliente);
 
                } catch (Exception e) {
                    System.out.println("No se pudo anyadir al cliente a causa de: " + e.getLocalizedMessage() );
                }

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;

            default:
                break;
            }

        } while (opcion != 0);

    }
}
