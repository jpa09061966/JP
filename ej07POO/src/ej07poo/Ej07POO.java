/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej07poo;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Jorge
 */
public class Ej07POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio sp = new PersonaServicio();
        Persona p1 = sp.crearPersona();
        System.out.println("datos" + p1);
        Persona p2 = sp.crearPersona();
        System.out.println("datos" + p2);
        Persona p3 = sp.crearPersona();
        System.out.println("datos" + p3);
        Persona p4 = sp.crearPersona();
        System.out.println("datos" + p4);
        System.out.println("=== Resultados ===");
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("IMC: " + p1.calcularIMC());
        System.out.println("Es mayor de edad: " + p1.esMayorDeEdad());

        System.out.println("=== Resultados ===");
        System.out.println("Persona 2:");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("IMC: " + p2.calcularIMC());
        System.out.println("Es mayor de edad: " + p2.esMayorDeEdad());

        System.out.println("=== Resultados ===");
        System.out.println("Persona 3:");
        System.out.println("Nombre: " + p3.getNombre());
        System.out.println("IMC: " + p3.calcularIMC());
        System.out.println("Es mayor de edad: " + p3.esMayorDeEdad());

        System.out.println("=== Resultados ===");
        System.out.println("Persona 4:");
        System.out.println("Nombre: " + p4.getNombre());
        System.out.println("IMC: " + p4.calcularIMC());
        System.out.println("Es mayor de edad: " + p4.esMayorDeEdad());

         // Cálculo del porcentaje de personas con IMC y edad mayor de edad
        int contadorIMC = 0;
        int contadorMayorEdad = 0;

        if (p1.calcularIMC() == 0) {
            contadorIMC++;
        }
        if (p1.esMayorDeEdad()) {
            contadorMayorEdad++;
        }

        if (p2.calcularIMC() == 0) {
            contadorIMC++;
        }
        if (p2.esMayorDeEdad()) {
            contadorMayorEdad++;
        }

        if (p2.calcularIMC() == 0) {
            contadorIMC++;
        }
        if (p3.esMayorDeEdad()) {
            contadorMayorEdad++;
        }

        if (p4.calcularIMC() == 0) {
            contadorIMC++;
        }
        if (p4.esMayorDeEdad()) {
            contadorMayorEdad++;
        }

        double porcentajeIMC = (double) contadorIMC / 4 * 100;
        double porcentajeMayorEdad = (double) contadorMayorEdad / 4 * 100;

        System.out.println("Porcentaje de personas con peso ideal: " + porcentajeIMC + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayorEdad + "%");
    }
    }


