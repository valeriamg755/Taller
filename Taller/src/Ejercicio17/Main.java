package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio17 gym = new ejercicio17();
        Scanner reader = new Scanner(System.in);
        System.out.println("How do you want to pay the monthly payment? 1(15 days for 18,000), 2(30 days for 35,000), 3(3 months for 86,000)");
        gym.setType(reader.nextInt());
        System.out.println("calculating...");
        System.out.println(gym.howMuch());
    }
}
