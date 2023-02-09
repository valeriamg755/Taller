package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        ejercicio7 areaRectangulo = new ejercicio7();

        areaRectangulo.altura = 12;
        areaRectangulo.base = 20;

        System.out.println(areaRectangulo.validarDatos());

        System.out.println("El area del rectgangulo es de: " + areaRectangulo.calcularArea() + "cm");



    }
}
