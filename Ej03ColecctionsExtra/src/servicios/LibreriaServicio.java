/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Libro;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class LibreriaServicio {
    private Set<Libro> libros;

    public LibreriaServicio() {
        libros = new HashSet<>();
    }
    public void agregarLibro(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }
    public boolean prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.prestar();
            }
        }
        return false;
    
}
    public boolean devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro.devolver();
            }
        }
        return false;
    }
public void mostrarLibros() {
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
}

    
}