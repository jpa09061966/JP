/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02poo;

import entidad.Circunferencia;

/**
 *
 * @author Jorge
 */
public class Ej02POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circunferencia = new Circunferencia(0); // Se inicializa con radio 0
        circunferencia.crearCircunferencia();

        System.out.println("Área de la circunferencia: " + circunferencia.calcularArea());
        System.out.println("Perímetro de la circunferencia: " + circunferencia.calcularPerimetro());
    }

}
