/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Jorge
 */
public class ServicioMascota {
    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo =leer.next();
        System.out.println("Introducir edad");
        Integer edad =leer.nextInt();
        //Mascota m = new Mascota(nombre, apodo, tipo);
        //mascotas.add(m);
        //return m;
        return new Mascota(nombre, apodo, tipo, edad);
    }
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la lista Mascotas son");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
        
        }
    public void fabricaChiquitos(int cantidad){
        for (int i=0; i<cantidad; i++){
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle", 10));
        }
    }
    public void fabricaMascota(int cantidad){
        for (int i=0; i<cantidad; i++){
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
        // TODO Añadir Try and Catch
        //    public void actualizarMascota(int index){
          //  Mascota m = mascotas.get(index);
            //m.setApodo("Roberto");
        }
    public void actualizarMascota(int index){
            if (index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("-----------Actualizar-----------");
            Mascota m = crearMascota();
            mascotas.set(index, m);
    }
    else { 
            System.out.println("El indice es erroneo");
    }
    }
    public void agregarMascota(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void eliminarMascota(int index){
        if (index <= (mascotas.size()-1)){
            mascotas.remove(index);
    }
    else { 
            System.out.println("Fallo al eliminar, el indice es erroneo");
    }
    }
}

