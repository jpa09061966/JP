/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Obtener valores del usuario para dia, mes y anio
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt() - 1;  // Restamos 1 ya que en la clase Date los meses van de 0 a 11
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();
        scanner.close();
        
        // Crear objeto Date con la fecha ingresada por el usuario
        Date fecha = new Date(anio - 1900, mes, dia);  // Restamos 1900 al año ya que en la clase Date se cuenta desde 1900
        
        // Obtener fecha actual
        Date fechaActual = new Date();
        
        // Mostrar la fecha ingresada por el usuario
        System.out.println("Fecha ingresada: " + fecha);
        
        // Calcular la diferencia de años entre la fecha ingresada y la fecha actual
        long diferenciaEnMillis = fechaActual.getTime() - fecha.getTime();
        long aniosTranscurridos = diferenciaEnMillis / (1000L * 60 * 60 * 24 * 365);  // 1000L representa milisegundos
        
        // Mostrar la diferencia de años
        System.out.println("Años transcurridos desde la fecha ingresada: " + aniosTranscurridos);
    }
}

    
    

