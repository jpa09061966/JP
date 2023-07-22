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
public class NIF {

    private long dni;
    private char letra;

    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra();
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        System.out.println("Introduce tu NIF:");
        Scanner leer = new Scanner(System.in);
        long dni = leer.nextLong();
        this.dni = dni;
        this.letra = calcularLetra();
    }

    public void mostrar() {
        System.out.println(dni + "-" + letra);
    }

    private char calcularLetra() {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int) (dni % 23);
        return letras[resto];
    }
}


