package Ejercicio3;

import java.util.Scanner;

public class Circulo implements calculosFormas{

    private double radio;
    private double area;
    private double perimetro;

    public Circulo() {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public double area() {
        area = pi * radio * radio;
        return this.area;
    }

    @Override
    public double perimetro() {
        perimetro = 2 * pi * radio;
        return this.perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void crearCirculo() {
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingresa el radio del circulo: ");
        this.radio = ingreso.nextDouble();
    }

}
