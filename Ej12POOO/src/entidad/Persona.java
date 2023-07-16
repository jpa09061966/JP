/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    // Constructor vacío
    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método de creación del objeto Persona
    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        this.setNombre(nombre);

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        String fechaStr = scanner.nextLine();
        Date fechaNacimiento = parseFecha(fechaStr);
        this.setFechaNacimiento(fechaNacimiento);
        
        scanner.close();
    }
    
    // Método para calcular la edad de la persona
    public int calcularEdad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        
        // Verificar si la fecha de nacimiento ya ha ocurrido en el año actual
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
            (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        
        return edad;
    }
    
    // Método para comparar si la edad de la persona es menor que otra edad
    public boolean menorQue(int edad) {
        int edadPersona = calcularEdad();
        return edadPersona < edad;
    }
    
    // Método para mostrar los datos de la persona
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + calcularEdad() + " años");
    }
    
    // Método auxiliar para convertir una cadena de fecha (dd/mm/aaaa) a un objeto Date
    private Date parseFecha(String fechaStr) {
        String[] partes = fechaStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1;
        int anio = Integer.parseInt(partes[2]) - 1900;
        return new Date(anio, mes, dia);
    }
}


