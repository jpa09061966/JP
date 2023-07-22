/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Jorge
 */
public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }


    public double[] obtenerRaices() {
        double[] soluciones = new double[2];
        if (tieneRaices()) {
            soluciones[0] = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            soluciones[1] = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        }
        return soluciones;
    }

    public double obtenerRaiz() {
        double raiz = 0;
        if (tieneRaiz()) {
            raiz = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        }
        return raiz;
    }

    public void calcular() {
        if (tieneRaices()) {
            System.out.println("Las soluciones son:");
            for (double solucion : obtenerRaices()) {
                System.out.println(solucion);
            }
        } else if (tieneRaiz()) {
            System.out.println("La solución es:");
            System.out.println(obtenerRaiz());
        } else {
            System.out.println("No hay soluciones");
        }
    }
}


