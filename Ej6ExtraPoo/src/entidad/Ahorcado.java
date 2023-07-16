/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Ahorcado {

    private char[] palabra;
    private int encontradas;
    private int jugadasMaximas;

    /**
     *
     */
    public Ahorcado() {
        palabra = new char[0];
        encontradas = 0;
        jugadasMaximas = 0;
    }

    /**
     *
     * @param palabra
     * @param jugadasMaximas
     */
    public Ahorcado(String palabra, int jugadasMaximas) {
        this.palabra = palabra.toCharArray();
        this.jugadasMaximas = jugadasMaximas;
        encontradas = 0;
    }

    /**
     *
     */
    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        String palabraIngresada = JOptionPane.showInputDialog(" INGRESE LA PALABRA A BUSCAR");
        //System.out.print("Ingrese la palabra a buscar: ");
        //String palabraIngresada = scanner.nextLine();
        palabra = palabraIngresada.toLowerCase().toCharArray();
        String jugadasMaximasStr = JOptionPane.showInputDialog("Ingrese la cantidad máxima de jugadas:");
        jugadasMaximas = Integer.parseInt(jugadasMaximasStr);
        // System.out.print("Ingrese la cantidad de jugadas máximas: ");
        //jugadasMaximas = scanner.nextInt();

        encontradas = 0;
    }

    /**
     *
     * @return
     */
    public int longitud() {
        return palabra.length;
    }

    /**
     *
     * @param letra
     * @return
     */
    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (char c : palabra) {
            if (c == letra) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }

        return encontrada;
    }

    /**
     *
     * @param letra
     * @return
     */
    public boolean encontradas(char letra) {
        int contador = 0;
        for (char c : palabra) {
            if (c == letra) {
                contador++;
                encontradas++;
            }
        }

        int faltantes = longitud() - encontradas;
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + ", " + faltantes + ")");

        if (contador > 0) {
            return true;
        } else {
            jugadasMaximas--;
            return false;
        }
    }

    /**
     *
     * @return
     */
    public int intentos() {
        return jugadasMaximas;
    }
/*public void juego() {
    while (intentos() > 0 && encontradas < longitud()) {
        char letra = JOptionPane.showInputDialog("Ingrese una letra:").toLowerCase().charAt(0);

        boolean pertenece = buscar(letra);
        boolean encontrada = encontradas(letra);

        JOptionPane.showMessageDialog(null, "Número de oportunidades restantes: " + intentos());

        if (encontrada) {
            JOptionPane.showMessageDialog(null, "La letra pertenece a la palabra");
        } else {
            JOptionPane.showMessageDialog(null, "La letra no pertenece a la palabra");
        }
    }

    JOptionPane.showMessageDialog(null, "Juego terminado");

    if (encontradas == longitud()) {
        JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado la palabra correctamente");
    } else {
        JOptionPane.showMessageDialog(null, "Lo sentimos, no has logrado adivinar la palabra");
    }

    JOptionPane.showMessageDialog(null, "LA PALABRA A ADIVINAR ES: " + String.valueOf(palabra));
}
*/

    /**
     *
     */

     public void juego() {
        Scanner scanner = new Scanner(System.in);
        while (intentos() > 0 && encontradas < longitud()) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);
            buscar(letra);
            encontradas(letra);
            System.out.println("Número de oportunidades restantes: " + intentos());
            System.out.println("----------------------------------------------");
        }

        if (encontradas == longitud()) {
            System.out.println("¡Felicidades! Has descubierto toda la palabra.");
        } else {
            System.out.println("Lo sentimos, no hay más oportunidades.");
        }
      System.out.println (

"La palabra a descubrir era: " + String.valueOf(palabra));
    }

}
