package Ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio18 Ejercicio18 = new ejercicio18();

        Scanner X = new Scanner(System.in);
        System.out.println("write three numbers");
        Ejercicio18.num1 = X.nextInt();
        Ejercicio18.num2 = X.nextInt();
        Ejercicio18.num3 = X.nextInt();

        Ejercicio18.SUMA = Ejercicio18.num1 + Ejercicio18.num2 + Ejercicio18.num3;

        System.out.println("Is it a triangle? " + Ejercicio18.VERIFICACIÓN());
    }
}
