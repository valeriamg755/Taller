package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ejercicio1 user = new ejercicio1();
        user.BaseUser = "vam :)";
        user.KeywordUser = "n0los3tud1me";

        Scanner validation = new Scanner(System.in);

        System.out.println("Hello, please enter your username");
        user.LoginUser = validation.next();

        System.out.println("Now, please type your password");
        user.LoginKey = validation.next();

        if (user.getAcces() == true) {
            System.out.println("successful entry :)))");
        } else {
            System.out.println("Try again with other User or Password :(");
        }
    }
}