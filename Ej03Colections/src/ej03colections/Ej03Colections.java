/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03colections;

import java.util.Scanner;
import servicio.ServicioAlumno;

/**
 *
 * @author Jorge
 */
public class Ej03Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        servicioAlumno.crearAlumnos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = scanner.nextLine();

        double promedio = servicioAlumno.notaFinal(nombreAlumno);

        if (promedio != -1) {
            System.out.println("El promedio final de " + nombreAlumno + " es: " + promedio);
        } else {
            System.out.println("No se encontró al alumno " + nombreAlumno);
        }
    }
    }
    

