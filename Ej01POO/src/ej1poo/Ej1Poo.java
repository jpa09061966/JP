/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1poo;

import entidad.Libro;

/**
 *
 * @author Jorge
 */
public class Ej1Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro = new Libro();
        libro.cargarLibro();
        libro.informarLibro();
    }
    
}
