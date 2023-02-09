package Ejercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio22 ejercicio22 = new ejercicio22();
        Scanner lector = new Scanner(System.in);

        System.out.println("Write your operator");
        ejercicio22.setOperador(lector.next());

        System.out.println("Write the total minutes consumed");
        ejercicio22.setMinutosConsumidos(lector.nextInt());

        ejercicio22.operadorPrecios();

        System.out.println("The price of your plan is:" + ejercicio22.precioTotal());
    }
}
