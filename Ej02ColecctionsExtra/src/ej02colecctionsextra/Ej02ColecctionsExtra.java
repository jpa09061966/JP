/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02colecctionsextra;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ej02ColecctionsExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();

        // Agregar 5 cantantes famosos a la lista
        listaCantantes.add(new CantanteFamoso("Cantante1", "Disco1"));
        listaCantantes.add(new CantanteFamoso("Cantante2", "Disco2"));
        listaCantantes.add(new CantanteFamoso("Cantante3", "Disco3"));
        listaCantantes.add(new CantanteFamoso("Cantante4", "Disco4"));
        listaCantantes.add(new CantanteFamoso("Cantante5", "Disco5"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el disco con más ventas: ");
                    String discoConMasVentas = scanner.nextLine();
                    listaCantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
                    break;
                case 2:
                    System.out.println("Lista de cantantes:");
                    for (CantanteFamoso cantante : listaCantantes) {
                        System.out.println("Nombre: " + cantante.getNombre() + ", Disco con más ventas: " + cantante.getDiscoConMasVentas());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cantante que desea eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    CantanteFamoso cantanteEliminar = null;
                    for (CantanteFamoso cantante : listaCantantes) {
                        if (cantante.getNombre().equalsIgnoreCase(nombreEliminar)) {
                            cantanteEliminar = cantante;
                            break;
                        }
                    }
                    if (cantanteEliminar != null) {
                        listaCantantes.remove(cantanteEliminar);
                        System.out.println("Cantante eliminado con éxito.");
                    } else {
                        System.out.println("Cantante no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
}

    
    

