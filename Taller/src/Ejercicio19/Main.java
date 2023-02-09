package Ejercicio19;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio19 copies = new ejercicio19();

        Scanner sc = new Scanner(System.in);

        System.out.println("Type your copies");
        copies.num_copias = sc.nextInt();

        copies.price1 = copies.num_copias * 120;
        copies.price2 = copies.num_copias * 100;
        copies.price3 = copies.num_copias * 80;
        copies.price4 = copies.num_copias * 50;

        System.out.println("Price is: $" + copies.price());
    }
}