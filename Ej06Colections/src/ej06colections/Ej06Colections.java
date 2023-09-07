/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06colections;

import servicio.ServicioTienda;

/**
 *
 * @author Jorge
 */
public class Ej06Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioTienda servicio = new ServicioTienda();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = Integer.parseInt(servicio.getScanner().nextLine());

            switch (opcion) {
                case 1:
                    servicio.agregarProducto();
                    break;

                case 2:
                    servicio.modificarPrecio();
                    break;

                case 3:
                    servicio.eliminarProducto();
                    break;

                case 4:
                    servicio.mostrarProductos();
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}

    
    

