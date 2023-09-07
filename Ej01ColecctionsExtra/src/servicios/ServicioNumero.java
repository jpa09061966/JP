/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Numero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class ServicioNumero {
    
    private List<Numero> numeros = new ArrayList();
    
    public void agregarNumero(int valor){
        numeros.add(new Numero(valor));
    }
    public int getCantidadNumeros(){
        return numeros.size();
    }
    public int getSuma(){
        int suma = 0;
        for (Numero num : numeros){
            suma += num.getValor();
        }
        return suma;
    }
    public double getPromedio(){
        int cantidadNumeros = getCantidadNumeros();
        if (cantidadNumeros == 0){
            return 0;
        }
                return(double) getSuma()/ cantidadNumeros;
    }
}
