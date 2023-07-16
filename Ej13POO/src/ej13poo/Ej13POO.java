/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13poo;

import entidad.Curso;

/**
 *
 * @author Jorge
 */
public class Ej13POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso curso = new Curso();

        curso.crearCurso();
        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("La ganancia semanal del curso es: $" + gananciaSemanal);
    }
}
