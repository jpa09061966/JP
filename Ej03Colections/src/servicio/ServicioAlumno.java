/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ServicioAlumno {
    
    private List<Alumno> listaAlumnos;

    public ServicioAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            Alumno alumno = new Alumno(nombre);

            for (int i = 1; i <= 3; i++) {
            int nota;
            do {
                System.out.print("Ingrese la nota " + i + " para " + nombre + " (entre 0 y 10): ");
                nota = Integer.parseInt(scanner.nextLine());
            } while (nota < 0 || nota > 10);
                alumno.agregarNota(nota);
            }
            listaAlumnos.add(alumno);

            System.out.print("¿Desea crear otro alumno? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public double calcularPromedio(List<Integer> notas) {
        int suma = 0;
        suma = notas.stream().map((nota) -> nota).reduce(suma, Integer::sum);
        return (double) suma / notas.size();
    }

    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                return calcularPromedio(notas);
            }
        }
        return -1; // Retorna -1 si no se encuentra el alumno
    }
    
}
