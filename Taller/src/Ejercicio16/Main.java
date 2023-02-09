package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio16 income = new ejercicio16();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your gender 1(Female), 2(Male)");
        income.setSex(reader.nextInt());
        System.out.println("Please enter your age");
        income.setAge(reader.nextInt());
        System.out.println("Calculating results...");
        System.out.println("The mayor gave him a grant of: " + income.confirmType());
    }
}
