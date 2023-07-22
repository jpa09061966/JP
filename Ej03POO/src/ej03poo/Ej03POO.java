/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03poo;

import entidad.Operacion;

/**
 *
 * @author Jorge
 */
public class Ej03POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        
        double suma = operacion.sumar();
        double resta = operacion.restar();
        double multiplicacion = operacion.multiplicar();
        double division = operacion.dividir();

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
    

