package Ejercicio2;

import java.util.List;

public class Cajero {


    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.registrarCuenta();

        double dinero = 0;
        double ingresar = cuenta.ingresar(dinero);
        System.out.println("El saldo luego del ingreso es " + ingresar);

        double retirar = cuenta.retirar(dinero);
        if (retirar == 0) {
            System.out.println("El saldo para retiro es insuficiente");
        } else {
            System.out.println("El saldo luego del retiro es " + retirar);
        }

        double extraccionRapida = cuenta.extraccionRapida();
        if (extraccionRapida == 0) {
            System.out.println("El saldo para extracción rápida es insuficiente");
        } else {
            System.out.println("El saldo luego de la estracción rápida es " + extraccionRapida);
        }

        double consultarSaldo = cuenta.getSaldo();
        System.out.println("El saldo actual es " + consultarSaldo);

        List<String> datosCuenta = cuenta.consultarDatos();
        System.out.println("LOS DATOS DE LA CUENTA SON: ");
        System.out.println("Numero de cuenta: " + datosCuenta.get(0));
        System.out.println("DNI de la cuenta: " + datosCuenta.get(1));
        System.out.println("El saldo actual de la cuenta es: " + datosCuenta.get(2));

    }
}
