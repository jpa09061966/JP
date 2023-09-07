/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05colections;

import servicio.ServicioPais;

/**
 *
 * @author Jorge
 */
public class Ej05Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPais servicio = new ServicioPais();

        boolean continuar = true;
        while (continuar) {
            servicio.agregarPais();

            System.out.println("¿Desea agregar otro país? (s/n)");
            String respuesta = servicio.getScanner().nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        servicio.mostrarPaises();
        servicio.mostrarPaisesOrdenados();
        servicio.eliminarPais();
        servicio.mostrarPaises();
    }
}

    
    

        
