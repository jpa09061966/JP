/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05poo;

import entidad.Cuenta;

/**
 *
 * @author Jorge
 */
public class Ej05POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        cuenta.ingresar(1);
        cuenta.retirar(2);
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
    }
    
}
