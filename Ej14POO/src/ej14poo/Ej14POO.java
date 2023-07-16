/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14poo;

import entidad.Movil;

/**
 *
 * @author Jorge
 */
public class Ej14POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Movil movil = new Movil();
        movil.cargarCelular();

        // Mostrar los datos del celular ingresado
        System.out.println("Datos del celular:");
        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Precio: " + movil.getPrecio());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Memoria RAM: " + movil.getRam());
        System.out.println("Almacenamiento: " + movil.getAlmacena());
        System.out.print("Código: ");
        int[] codigo = movil.getCodigo();
        for (int i = 0; i < codigo.length; i++) {
            System.out.print(codigo[i]);
        }
        System.out.println("");
    }
    
}

    
    

