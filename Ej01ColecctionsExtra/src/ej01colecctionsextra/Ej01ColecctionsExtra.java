/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01colecctionsextra;

import java.util.Scanner;
import servicios.ServicioNumero;

/**
 *
 * @author jorge
 */
public class Ej01ColecctionsExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioNumero servicioNumero = new ServicioNumero();
        Scanner scanner = new Scanner(System.in);
          System.out.println("Introduce valores numericos enteros"); 
              System.out.println("Si deseas terminar de ingresar valores ingresa -99"); 
              int valor = 0;
              while (valor != -99){
                  try {
                      valor = scanner.nextInt();
                      if (valor != -99){
                          servicioNumero.agregarNumero(valor);
                      }
                      
                  } catch (java.util.InputMismatchException e){
                           System.out.println("Entrada no valida. Introduce un numero entero.");
                      scanner.next();//limpia la entrada de datos
              }
              }
              scanner.close();
              
              System.out.println("Numero de valores leidos" + servicioNumero.getCantidadNumeros());
              System.out.println("Suma de los valores:" + servicioNumero.getSuma());
              System.out.println("Promedio de los valores:" + servicioNumero.getPromedio());

              

    }
    
}
