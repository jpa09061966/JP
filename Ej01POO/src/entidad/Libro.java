/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro() {
        // Constructor vacío
    }
    
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ISBN: ");
        ISBN = scanner.nextLine();
        
        System.out.print("Título: ");
        titulo = scanner.nextLine();
        
        System.out.print("Autor: ");
        autor = scanner.nextLine();
        
        System.out.print("Número de páginas: ");
        numPaginas = scanner.nextInt();
    }
    
    public void informarLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
    
    public static void main(String[] args) {
       
    }
}


