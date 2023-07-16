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
public class Movil {
    private String marca;
    private Double precio;
    private String modelo;
    private int ram;
    private int almacena;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, Double precio, String modelo, int ram, int almacena, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.ram = ram;
        this.almacena = almacena;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacena() {
        return almacena;
    }

    public void setAlmacena(int almacena) {
        this.almacena = almacena;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    // Método para cargar los datos de un celular desde el usuario
    public void cargarCelular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del celular:");
        marca = scanner.nextLine();
        System.out.println("Ingrese el precio del celular:");
        precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el modelo del celular:");
        modelo = scanner.nextLine();
        System.out.println("Ingrese la cantidad de memoria RAM del celular:");
        ram = scanner.nextInt();
        System.out.println("Ingrese el almacenamiento del celular:");
        almacena = scanner.nextInt();
        //scanner.nextLine(); // Limpiar el buffer
        ingresarCodigo();
    }

    // Método para ingresar el código completo del celular
    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);
        codigo = new int[7];
        System.out.println("Ingrese el código de 7 números del celular:");
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = scanner.nextInt();
        }
    }

}
