/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04poo;

import entidad.Rectangulo;

/**
 *
 * @author Jorge
 */
public class Ej04POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();

        double superficie =rectangulo.superficie();
        double perimetro = rectangulo.perimetro();

        System.out.println("Superficie del rectángulo: " + superficie);
        System.out.println("Perímetro del rectángulo: " + perimetro);

        System.out.println("Dibujo del rectángulo:");
        rectangulo.dibujar();
    }
    }
