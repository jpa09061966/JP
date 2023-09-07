/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jorge
 */
public class ServicioPais {
    private Set<Pais> conjuntoPaises = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarPais() {
        System.out.println("Ingrese el nombre de un país:");
        String nombrePais = scanner.nextLine();
        Pais pais = new Pais(nombrePais);
        conjuntoPaises.add(pais);
        System.out.println("País agregado al conjunto.");
    }

    public void mostrarPaises() {
        System.out.println("Países guardados en el conjunto:");
        for (Pais pais : conjuntoPaises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenados() {
        List<Pais> listaPaisesOrdenados = new ArrayList<>(conjuntoPaises);
        Collections.sort(listaPaisesOrdenados, Comparator.comparing(Pais::getNombre));

        System.out.println("Países ordenados alfabéticamente:");
        for (Pais pais : listaPaisesOrdenados) {
            System.out.println(pais);
        }
    }

    public void eliminarPais() {
        System.out.println("Ingrese el nombre del país a buscar y eliminar:");
        String nombreBuscado = scanner.nextLine();

        Iterator<Pais> iterator = conjuntoPaises.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equalsIgnoreCase(nombreBuscado)) {
                iterator.remove();
                System.out.println("País eliminado del conjunto.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }
    public Scanner getScanner() {
        return scanner;
    }
}

    

