/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5extrapoo;

import entidad.Meses;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ej5ExtraPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Meses meses = new Meses();
        Scanner scanner = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Adivine el mes secreto. Introduzca el nombre del mes");


        while (true) {
            String mesIngresado = scanner.nextLine().toLowerCase();
            
            if (meses.adivinarMes(mesIngresado)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        }
    }
}
