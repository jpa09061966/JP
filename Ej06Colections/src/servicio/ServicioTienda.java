/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ServicioTienda {
    private Map<String, Double> productos = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarProducto() {
        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = scanner.nextLine();

        if (!productos.containsKey(nombreProducto)) {
            System.out.println("Ingrese el precio del producto:");
            double precioProducto = Double.parseDouble(scanner.nextLine());
            productos.put(nombreProducto, precioProducto);
            System.out.println("Producto agregado.");
        } else {
            System.out.println("El producto ya existe en la tienda.");
        }
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto a modificar:");
        String productoModificar = scanner.nextLine();

        if (productos.containsKey(productoModificar)) {
            System.out.println("Ingrese el nuevo precio:");
            double nuevoPrecio = Double.parseDouble(scanner.nextLine());
            productos.put(productoModificar, nuevoPrecio);
            System.out.println("Precio del producto modificado.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String productoEliminar = scanner.nextLine();

        if (productos.containsKey(productoEliminar)) {
            productos.remove(productoEliminar);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    public Scanner getScanner() {
        return scanner;
    }

    
}

    

