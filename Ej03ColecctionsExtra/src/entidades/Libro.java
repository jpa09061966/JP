/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jorge
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    
    public boolean prestar() {
        if (ejemplares > ejemplaresPrestados) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
}
    public boolean devolver(){
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }
    
}

