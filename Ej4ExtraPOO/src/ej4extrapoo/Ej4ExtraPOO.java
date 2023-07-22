/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extrapoo;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej4ExtraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    System.out.println("Introduce tu NIF:");
    Scanner leer = new Scanner(System.in);
    long dni = leer.nextLong();

    NIF nif = new NIF(dni);

    nif.mostrar();
}

    }
    

