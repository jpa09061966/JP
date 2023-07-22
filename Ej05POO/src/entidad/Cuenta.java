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
public class Cuenta {

    private int numeroCuenta;
    private long DNI;
    private int saldo;
    private Double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldo, Double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public void  crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.print("Ingrese el DNI del cliente: ");
        long DNI = scanner.nextLong();
        System.out.print("Ingrese el saldo actual: ");
        int saldo = scanner.nextInt();
        System.out.print("Ingrese el interés: ");
        double interes = scanner.nextDouble();

    }
    public void ingresar(int ingreso) {
        saldo += ingreso;
    }

    public void retirar(int retiro) {
        if (retiro <= saldo) {
            saldo -= retiro;
        } else {
            saldo = 0;
        }
    }

    public void extraccionRapida() {
        double retiroMaximo = saldo * 0.2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a retirar (máximo 20% del saldo): ");
        double retiro = scanner.nextDouble();
        if (retiro <= retiroMaximo) {
            saldo -= retiro;
        } else {
            System.out.println("El retiro supera el límite máximo permitido.");
        }
    }

    public int consultarSaldo() {
        return saldo;
    }

    public void consultarDatos() {
        System.out.println("DNI: " + DNI);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Interés: " + interes);
    }
}
