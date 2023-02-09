package Ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio13 parOInpar = new ejercicio13();
        Scanner lector = new Scanner(System.in);

        System.out.println("Enter a number to find out if it is odd or even ");
        parOInpar.asignarNumero(lector.nextInt());

        System.out.println(parOInpar.calculo());
    }
}
