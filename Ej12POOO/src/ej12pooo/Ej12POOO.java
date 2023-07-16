/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12pooo;

import entidad.Persona;

/**
 *
 * @author Jorge
 */
public class Ej12POOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear un objeto Persona
        Persona persona = new Persona();

        // Llamar al método crearPersona() para llenar los datos de la persona
        persona.crearPersona();

        // Mostrar los datos de la persona
        persona.mostrarPersona();

        // Calcular la edad de la persona
        int edad = persona.calcularEdad();
        System.out.println("Edad: " + edad + " años");

        // Comparar la edad con otro valor
        int otraEdad = 60;
        boolean esMenor = persona.menorQue(otraEdad);
        System.out.println("¿Es menor que " + otraEdad + " años? " + esMenor);
    }
}

    
    

