/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author Jorge
 */
public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private Integer edad;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, Integer edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + '}';
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    
}
