package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio11 positivoONegativo = new ejercicio11();
        Scanner lector = new Scanner(System.in);

        System.out.println("Enter a number to know if it is positive or negative");
        positivoONegativo.asignarNumero(lector.nextByte());

        System.out.println(positivoONegativo.resultado());
    }
}
