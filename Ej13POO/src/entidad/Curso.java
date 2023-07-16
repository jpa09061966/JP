/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    // Constructor por defecto

    /**
     *
     */
    public Curso() {
        alumnos = new String[5];
    }

    // Constructor parametrizado

    /**
     *
     * @param nombreCurso
     * @param cantidadHorasPorDia
     * @param cantidadDiasPorSemana
     * @param turno
     * @param precioPorHora
     * @param alumnos
     */

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    /**
     *
     * @return
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     *
     * @param nombreCurso
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     *
     * @return
     */
    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    /**
     *
     * @param cantidadHorasPorDia
     */
    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    /**
     *
     * @return
     */
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    /**
     *
     * @param cantidadDiasPorSemana
     */
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    /**
     *
     * @return
     */
    public String getTurno() {
        return turno;
    }

    /**
     *
     * @param turno
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     *
     * @return
     */
    public double getPrecioPorHora() {
        return precioPorHora;
    }

    /**
     *
     * @param precioPorHora
     */
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    /**
     *
     * @return
     */
    public String[] getAlumnos() {
        return alumnos;
    }

    /**
     *
     * @param alumnos
     */
    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
   
      

    // Método para cargar los nombres de los alumnos

    /**
     *
     */
    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            String nombreAlumno = scanner.nextLine();
            alumnos[i] = nombreAlumno;
        }
        scanner.close();
    }

    // Método para crear el curso

    /**
     *
     */
    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();
        this.setNombreCurso(nombreCurso);

        System.out.print("Ingrese la cantidad de horas por día: ");
        int cantidadHorasPorDia = scanner.nextInt();
        this.setCantidadHorasPorDia(cantidadHorasPorDia);

        System.out.print("Ingrese la cantidad de días por semana: ");
        int cantidadDiasPorSemana = scanner.nextInt();
        this.setCantidadDiasPorSemana(cantidadDiasPorSemana);

        System.out.print("Ingrese el turno (mañana o tarde): ");
        String turno = scanner.next();
        this.setTurno(turno);

        System.out.print("Ingrese el precio por hora: ");
        double precioPorHora = scanner.nextDouble();
        this.setPrecioPorHora(precioPorHora);

        cargarAlumnos();

    }

    // Método para calcular la ganancia semanal del curso

    /**
     *
     * @return
     */
    public double calcularGananciaSemanal() {
        int cantidadAlumnos = alumnos.length;
        double gananciaSemanal = cantidadHorasPorDia * cantidadDiasPorSemana * precioPorHora * cantidadAlumnos;
        return gananciaSemanal;
    }

  
}


