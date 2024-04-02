package Ejercicio1;

public class Calculadora {
    public static void main(String[] args) {
        Operacion calcular = new Operacion();
        calcular.crearOperacion();

        double suma = calcular.sumar();
        System.out.println("La suma de los numeros es " + suma);

        double resta = calcular.restar();
        System.out.println("La resta de los numeros es " + resta);


        double multiplicacion = calcular.multiplicar();
        if (multiplicacion == 0) {
            System.out.println("No se puede multiplicar por cero");
        } else {
            System.out.println("La multiplicacion de los numeros es " + multiplicacion);
        }


        double division = calcular.dividir();
        if (division == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            System.out.println("La division de los numeros es " + division);
        }
    }
}