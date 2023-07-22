/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner entra = new Scanner(System.in);
        System.out.println("Ingrese el numero1");
        numero1 =entra.nextDouble();
        System.out.println("Ingrese el numero2");
        numero2 =entra.nextDouble();
    }
    public double sumar(){
            return numero1 + numero2;
    }
    public double restar(){
            return numero1 - numero2;
    }
    public double multiplicar(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            return numero1 * numero2;
    }
    }
    public double dividir(){
        if(numero2==0){
            System.out.println("El numero 2 es 0 no se puede hacer la division");
            return 0;
        }
            else{
                    return numero1 / numero2;
                    
                    }
        }
        }

    


