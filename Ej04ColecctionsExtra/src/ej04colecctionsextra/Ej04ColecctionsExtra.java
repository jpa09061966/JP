/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04colecctionsextra;

import entidades.CiudadPostal;
import java.util.*;
import servicio.LibreriaServicio;
import java.util.Scanner;

public class Ej04ColecctionsExtra{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibreriaServicio servicio = new LibreriaServicio();

        // Pedir al usuario 10 códigos postales y ciudades
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un código postal: ");
            String codigoPostal = scanner.next();
            System.out.print("Ingresa la ciudad correspondiente: ");
            String ciudad = scanner.next();
            servicio.agregarCodigoPostal(codigoPostal, ciudad);
        }

        // Mostrar datos introducidos
        List<CiudadPostal> codigosOrdenados = servicio.obtenerTodosLosCodigosPostalesOrdenados();
        System.out.println("Datos introducidos:");
        for (CiudadPostal cp : codigosOrdenados) {
            System.out.println(cp);
        }

        // Pedir un código postal y mostrar la ciudad asociada
        System.out.print("Ingresa un código postal para buscar la ciudad: ");
        String codigoBuscado = scanner.next();
        CiudadPostal ciudadAsociada = servicio.obtenerCiudadPostal(codigoBuscado);
        if (ciudadAsociada != null) {
            System.out.println("Ciudad asociada: " + ciudadAsociada.getCiudad());
        } else {
            System.out.println("El código postal no existe en el HashMap.");
        }

        // Agregar una ciudad con su código postal correspondiente
        System.out.print("Ingresa un nuevo código postal: ");
        String nuevoCodigoPostal = scanner.next();
        System.out.print("Ingresa la ciudad correspondiente: ");
        String nuevaCiudad = scanner.next();
        servicio.agregarCodigoPostal(nuevoCodigoPostal, nuevaCiudad);

        // Eliminar 1 ciudades existentes
        for (int i = 0; i < 1; i++) {
            System.out.print("Ingresa el código postal de la ciudad a eliminar: ");
            String codigoEliminar = scanner.next();
            servicio.eliminarCodigoPostal(codigoEliminar);
        }

        // Mostrar datos actualizados
        codigosOrdenados = servicio.obtenerTodosLosCodigosPostalesOrdenados();
        System.out.println("Datos actualizados:");
        for (CiudadPostal cp : codigosOrdenados) {
            System.out.println(cp);
        }
    }
}
