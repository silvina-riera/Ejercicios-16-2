package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldo;

    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta() {
        this.numeroCuenta = 0;
        this.dni = 0;
        this.saldo = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return dni;
    }

    public void setDNI(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    Scanner input = new Scanner(System.in);
    public void registrarCuenta() {

        System.out.print("Ingresa el numero de cuenta: ");
        this.numeroCuenta = input.nextInt();

        System.out.print("Ingresa el dni: ");
        this.dni = input.nextLong();

    }

    public double ingresar(double ingreso) {

        System.out.print("Ingrese el dinero a depositar: ");
        ingreso = input.nextDouble();
        this.saldo = this.saldo + ingreso;

        return this.saldo;

    }

    public double retirar(double retiro) {

        System.out.print("Ingrese el dinero a retirar: ");
        retiro = input.nextDouble();
        if (this.saldo >= retiro) {
            this.saldo = this.saldo - retiro;
        return this.saldo;
        } else {
            return 0;
        }
    }
    public double extraccionRapida() {
        if (this.saldo > 0) {
            this.saldo = this.saldo * 0.8;
            return this.saldo;
        } else {
            return 0;
        }
    }

    public List<String> consultarDatos ()
    {
        List<String> consultarDatos = new ArrayList<>();
        consultarDatos.add(String.valueOf(numeroCuenta));
        consultarDatos.add(String.valueOf(dni));
        consultarDatos.add(String.valueOf(saldo));

        return consultarDatos;
    }

}
