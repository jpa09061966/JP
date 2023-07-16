
package ej09poo;

import entidad.Matematica;
import java.util.Random;

public class Ej09POO {

    public static void main(String[] args) {
        Random random = new Random();
        double numero1 = random.nextDouble()* 10 ;
        double numero2 = random.nextDouble()* 10;
        
        Matematica matematica = new Matematica();
        matematica.setNumero1(numero1);
        matematica.setNumero2(numero2);
        
        System.out.println("Número 1: " + matematica.getNumero1());
        System.out.println("Número 2: " + matematica.getNumero2());
        
        double mayor = matematica.devolverMayor();
        System.out.println("El mayor número es: " + mayor);
        
        double potencia = matematica.calcularPotencia();
        System.out.println("La potencia del mayor número elevado al menor es: " + potencia);
        
        double raiz = matematica.calcularRaiz();
        System.out.println("La raíz cuadrada del menor número es: " + raiz);
    }
}

    
    

