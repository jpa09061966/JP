/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3extrapoo;

import entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej3ExtraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaramos una instancia de la clase Raices
        Raices ecuacion = new Raices();
        Scanner leer = new Scanner(System.in);
        // Le pedimos al usuario que ingrese los valores de los atributos

        System.out.println("Ingrese el valor de a: ");
        double a = leer.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        double b = leer.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        double c = leer.nextDouble();

        // Asigna los valores ingresados por el usuario a los atributos de la clase Raices
        ecuacion.setA(a);
        ecuacion.setB(b);
        ecuacion.setC(c);
        // Calculamos el discriminante
        double discriminante = ecuacion.getDiscriminante();

        // Comprobamos si hay soluciones
        if (discriminante >= 0) {

            // Hay dos soluciones
            double[] soluciones = ecuacion.obtenerRaices();

            // Imprimimos las soluciones
            System.out.println("Las soluciones son:");
            for (double solucion : soluciones) {
                System.out.println(solucion);
            }
        } else if (discriminante == 0) {

            // Hay una solución
            double raiz = ecuacion.obtenerRaiz();

            // Imprimimos la solución
            System.out.println("La solución es:");
            System.out.println(raiz);
        } else {

            // No hay soluciones
            System.out.println("No hay soluciones");
        }
    }
}
