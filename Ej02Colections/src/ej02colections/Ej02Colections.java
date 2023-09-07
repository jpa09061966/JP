/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej02Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razaPerros = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar){
            System.out.print("Ingrese la raza del perro:");
            String raza = scanner.nextLine();
            razaPerros.add(raza);
            System.out.print("Desea agregar otra raza s/n?");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")){
                continuar = false;
            }
        }
        System.out.println("\nRazas de perrros guardadas:");
        for (String raza : razaPerros){
            System.out.println(raza);
    }
        System.out.print("\nIngrese el nombre de un perro a buscar y eliminar: ");
        String perroABuscar = scanner.nextLine();

        Iterator<String> iterator = razaPerros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase(perroABuscar)) {
                iterator.remove();
            }
        }
        
        Collections.sort(razaPerros);

        System.out.println("\nRazas de perros después de eliminar y ordenar:");
        razaPerros.forEach((raza) -> {
            System.out.println(raza);
        });
    }
}






    

