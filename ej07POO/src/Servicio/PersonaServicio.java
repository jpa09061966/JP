/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Boolean correcto = false;
        Persona persona1 = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        persona1.setEdad(leer.nextInt());
        while (!correcto) {
            System.out.println("Ingrese el Sexo (H-M-O: ");
            String sex = leer.next();
            if (sex.equals("H") || sex.equals("M") || sex.equals("O")) {
                persona1.setSexo(sex.charAt(0));
                correcto = true;
            } else {
                System.out.println("Ingreso Incorrecto, reintente....");
            }
        }
        System.out.println("Ingrese el peso de la persona");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        persona1.setAltura(leer.nextDouble());
        return persona1;
    }
 
    }

  
    

    
    

