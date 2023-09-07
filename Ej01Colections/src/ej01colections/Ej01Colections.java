/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01colections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej01Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la raza del perro: ");
            String raza = scanner.nextLine();
            razasPerros.add(raza);

            System.out.print("¿Desea agregar otro perro? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\nRazas de perros guardadas:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}
 
    
    

