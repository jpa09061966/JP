
package ej08poo;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ej08POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Cadena cadena = new Cadena();

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        cadena.setFrase(frase);

        cadena.mostrarVocales();
        cadena.invertirFrase();

        System.out.print("Ingrese un carácter: ");
        String letra = scanner.nextLine();
        cadena.vecesRepetido(letra);

        System.out.print("Ingrese otra frase: ");
        String otraFrase = scanner.nextLine();
        cadena.compararLongitud(otraFrase);
        cadena.unirFrases(otraFrase);

        System.out.print("Ingrese un carácter para reemplazar 'a' en la frase: ");
        letra = scanner.nextLine();
        cadena.reemplazar(letra);

        System.out.print("Ingrese un carácter para buscar en la frase: ");
        letra = scanner.nextLine();
        boolean contieneLetra = cadena.contiene(letra);
        System.out.println("La frase " + (contieneLetra ? "contiene" : "no contiene") + " el carácter '" + letra + "'.");
    }
}

    
    

