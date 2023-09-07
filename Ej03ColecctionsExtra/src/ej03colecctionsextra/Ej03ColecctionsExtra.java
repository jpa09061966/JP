/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03colecctionsextra;

import entidades.Libro;
import java.util.Scanner;
import servicios.LibreriaServicio;

/**
 *
 * @author jorge
 */
public class Ej03ColecctionsExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibreriaServicio libreriaServicio = new LibreriaServicio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Prestar un libro");
            System.out.println("3. Devolver un libro");
            System.out.println("4. Mostrar libros en la librería");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de ejemplares: ");
                    int ejemplares = scanner.nextInt();
                    Libro nuevoLibro = new Libro(titulo, autor, ejemplares);
                    libreriaServicio.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro que desea prestar: ");
                    String libroPrestar = scanner.nextLine();
                    if (libreriaServicio.prestarLibro(libroPrestar)) {
                        System.out.println("Libro prestado con éxito.");
                    } else {
                        System.out.println("No se pudo prestar el libro.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro que desea devolver: ");
                    String libroDevolver = scanner.nextLine();
                    if (libreriaServicio.devolverLibro(libroDevolver)) {
                        System.out.println("Libro devuelto con éxito.");
                    } else {
                        System.out.println("No se pudo devolver el libro.");
                    }
                    break;
                case 4:
                    libreriaServicio.mostrarLibros();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
    }
    

