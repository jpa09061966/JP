/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class Alumno {
    
    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(int nota) {
        notas.add(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }
    
}
