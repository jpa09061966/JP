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
public class Puntos {
    private double x1, y1, x2, y2;

    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        x1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y del primer punto: ");
        y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        x2 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada y del segundo punto: ");
        y2 = scanner.nextDouble();
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }

   
}


