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
public class Rectangulo {

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner entra = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base del rectangulo: ");
        base = entra.nextDouble();
        System.out.print("Ingrese el valor de la altura del rectangulo: ");
        altura = entra.nextDouble();
    }

    public Double superficie() {
        return base * altura;
    }

    public Double perimetro() {
        return (base + altura) * 2;
    }

    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            if (i == 0) {
                for (int j = 0; j < base; j++) {
                    System.out.print("_");
                }
                System.out.println();
                
            }
            
            if (i != 0 && i != altura - 1) {
                for (int j = 0; j < base; j++) {
                    if (j == 0) {
                        System.out.print("|");
                    }
                    if (j != 0 && j != base - 1) {
                        System.out.print("  ");
                    }
                    if (j == base - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
            if (i == altura-1) {
                for (int j = 0; j < base; j++) {
                    System.out.print("_");
                }
                }
}
                System.out.println();
            }
        }

    
