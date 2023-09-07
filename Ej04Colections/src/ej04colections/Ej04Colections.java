/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04colections;

import servicio.ServicioPelicula;

/**
 *
 * @author Jorge
 */
public class Ej04Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPelicula servicio = new ServicioPelicula();

        boolean continuar = true;
        while (continuar) {
            servicio.agregarPelicula();

            System.out.println("¿Desea agregar otra película? (s/n)");
            String respuesta = servicio.getScanner().nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }
        servicio.mostrarTodasPeliculas();
        servicio.mostrarPeliculasMayorAUnaHora();
        servicio.ordenarPeliculasPorDuracionMayorAMenor();
        servicio.ordenarPeliculasPorDuracionMenorAMayor();
        servicio.ordenarPeliculasPorTitulo();
        servicio.ordenarPeliculasPorDirector();
    }
}

    
    

