package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio12 lavadoras = new ejercicio12();
        Scanner lector = new Scanner(System.in);

        System.out.println("Enter 1 for a large washer / Enter 2 for a small washer");
        lavadoras.asignarTipo(lector.nextInt());
        System.out.println("How many washing machines do you want to rent?");
        lavadoras.asignarCantidad(lector.nextInt());
        System.out.println("For how long do you want to rent them?");
        lavadoras.asignarHoras(lector.nextInt());

        lavadoras.valor();

        System.out.println("the full value is: " + lavadoras.valorTotal());
    }
}
