/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class ServicioPelicula {
    private List<Pelicula> listaPeliculas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void agregarPelicula() {
        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el director de la película:");
        String director = scanner.nextLine();

        System.out.println("Ingrese la duración de la película en horas:");
        double duracion = Double.parseDouble(scanner.nextLine());

        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        listaPeliculas.add(pelicula);
    }

    public void mostrarTodasPeliculas() {
        System.out.println("Lista de todas las películas:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculasMayorAUnaHora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarPeliculasPorDuracionMayorAMenor() {
        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        Collections.sort(listaPeliculas, Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("Películas ordenadas por título (alfabéticamente):");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDirector));
        System.out.println("Películas ordenadas por director (alfabéticamente):");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public Scanner getScanner() {
        return scanner;
    }
}

    

