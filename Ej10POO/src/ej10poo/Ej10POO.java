/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10poo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Ej10POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        // Inicializar arreglo A con números aleatorios
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble()* 10;
        }
        
        System.out.println("Arreglo A (sin ordenar):");
        System.out.println(Arrays.toString(arregloA));
        
        // Ordenar arreglo A de menor a mayor
        Arrays.sort(arregloA);
        
        // Copiar los primeros 10 números ordenados al arreglo B
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        
        // Rellenar los 10 últimos elementos de arreglo B con el valor 0.5
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
        
        System.out.println("Arreglo A (ordenado):");
        System.out.println(Arrays.toString(arregloA));
        
        System.out.println("Arreglo B (combinado):");
        System.out.println(Arrays.toString(arregloB));
    }
}

    
    

