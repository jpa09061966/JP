/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Jorge
 */
public class Cadena {
    private String frase;
    private int longitud;

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
     public void mostrarVocales() {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }

        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase() {
        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse();

        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {
        char caracter = letra.charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El carácter '" + caracter + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int longitudOtraFrase = otraFrase.length();

        if (longitud == longitudOtraFrase) {
            System.out.println("La longitud de ambas frases es igual.");
        } else {
            System.out.println("La longitud de ambas frases es diferente.");
        }
    }

    public void unirFrases(String otraFrase) {
        String fraseUnida = frase + " " + otraFrase;
        System.out.println("Frase resultante: " + fraseUnida);
    }

    public void reemplazar(String letra) {
        char letraOriginal = 'a';
        char letraReemplazo = letra.charAt(0);

        String fraseReemplazada = frase.replace(letraOriginal, letraReemplazo);
        System.out.println("Frase resultante: " + fraseReemplazada);
    }

    public boolean contiene(String letra) {
        char caracter = letra.charAt(0);
        return frase.indexOf(caracter) != -1;
    }
}
    
    
    

