package Ejercicio3;

import java.util.Scanner;

public class Rectangulo implements calculosFormas{

    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulo() {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public double area() {
        area = base * altura;
        return this.area;
    }

    @Override
    public double perimetro() {
        perimetro = (base + altura) * 2;
        return this.perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void crearRectangulo() {
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingresa la base del rectangulo: ");
        this.base = ingreso.nextDouble();

        System.out.print("Ingresa la altura del rectangulo: ");
        this.altura = ingreso.nextDouble();

    }
}
