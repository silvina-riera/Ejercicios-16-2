package Ejercicio3;

public class CrearFormas {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.crearCirculo();

        double areaCirculo = circulo.area();
        System.out.println("El area del circulo es " + areaCirculo);

        double perimetroCirculo = circulo.perimetro();
        System.out.println("El perimetro del circulo es " + perimetroCirculo);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();

        double areaRectangulo = rectangulo.area();
        System.out.println("El area del rectangulo es " + areaRectangulo);

        double perimetroRectangulo = rectangulo.perimetro();
        System.out.println("El perimetro del rectangulo es " + perimetroRectangulo);
    }

}
