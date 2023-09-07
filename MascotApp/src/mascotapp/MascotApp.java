/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;
import mascotapp.utilidades.Comparadores;

/**
 *
 * @author Jorge
 */
public class MascotApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Mascota> mascotas = new ArrayList();

        mascotas.add(new Mascota("Fer", "Chiquito", "Perro", 10));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato", 8));
        mascotas.add(new Mascota("Negra", "Zoe", "Loro", 4));
        mascotas.add(new Mascota("Topo", "Tom", "Perro", 2));
        
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        for (Mascota mascota : mascotas){
            System.out.println(mascota);

//        ServicioMascota servMasc = new ServicioMascota();
        //servMasc.fabricaChiquitos(140);
//        servMasc.fabricaMascota(2);
//        servMasc.mostrarMascotas();
//        servMasc.actualizarMascota(0);
//        servMasc.mostrarMascotas();
//        servMasc.eliminarMascota(3);
//        servMasc.mostrarMascotas();
//        List<String> nombres = new ArrayList();
//        nombres.add("Lola");
//        nombres.add("Rodman");
//        nombres.add("Chiquito");
//        for (String aux : nombres) {
//            if (aux.equals("Lola")) {
//                nombres.remove(aux);
//        }
//        for (int i = 0; i < nombres.size(); i++) {
//            String m = nombres.get(i);
//            if (m.equals("Lola")) {
//                nombres.remove(m);
//            }
//                System.out.println(nombres.get(i));
//        dssdsfds
//    Iterator<String> it = nombres.iterator();
//    while (it.hasNext()) {
//        String aux = it.next();
//        if (aux.equals("Lola")) {
//            it.remove();
//            
    }
}

//        nombres.forEach((e) -> System.out.println(e));
//            }
}

