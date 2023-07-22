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
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

   /* public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
*/
    
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera ha sido llenada.");
    }

    public void servirTaza(int tamañoTaza) {
        if (cantidadActual >= tamañoTaza) {
            cantidadActual -= tamañoTaza;
            System.out.println("Se ha servido una taza de café.");
        } else {
            System.out.println("No hay suficiente café para llenar la taza.");
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }

    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            System.out.println("Se ha agregado café a la cafetera.");
        } else {
            System.out.println("La cafetera no puede contener tanta cantidad de café.");
        }
    }
        
    }



