/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06poo;

import entidad.Cafetera;

/**
 *
 * @author Jorge
 */
public class Ej06POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera(1500, 500);
        System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima());
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());

        cafetera.llenarCafetera();
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());

        cafetera.servirTaza(200);
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());

        cafetera.vaciarCafetera();
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());

        cafetera.agregarCafe(800);
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
    }
    
}
