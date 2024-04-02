package Ejercicio1;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public double getNumero1() {

        return numero1;
    }

    public void setNumero1(double numero1) {

        this.numero1 = numero1;
    }

    public double getNumero2() {

        return numero2;
    }

    public void setNumero2(double numero2) {

        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        this.numero1 = ingreso.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        this.numero2 = ingreso.nextDouble();

        ingreso.close();
    }

    public double sumar() {

        return this.numero1 + this.numero2;
    }

    public double restar() {

        return this.numero1 - this.numero2;
    }

    public double multiplicar() {
        if (this.numero1 != 0 || this.numero2 != 0) {
            return this.numero1 * this.numero2;
        } else {
            return 0.0;
        }
    }

    public double dividir() {
        if (this.numero2 != 0) {
            return this.numero1 / this.numero2;
        } else {
            return 0.0;
        }
    }
}
