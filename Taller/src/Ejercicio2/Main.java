package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio2 medicApp = new ejercicio2();
        medicApp.room = 7;
        medicApp.nameDoc = "Vyn Ritcher";
        medicApp.setMedCenter("Giannovyn Mental Health Research Center");
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int option;

        while (!exit) {

            System.out.println("1. Make an Appoiment");
            System.out.println("2. Check Appoiment ");
            System.out.println("3. Change hour");
            System.out.println("4. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please type your name");
                    medicApp.namePacient = sc.next();

                    System.out.println("Now, the date");
                    medicApp.date = sc.next();

                    System.out.println("Finally, please type the hour");
                    medicApp.hour = sc.next();
                    System.out.println(medicApp.makeApp());
                    break;
                case 2:
                    System.out.println(medicApp.checkData());
                    break;
                case 3:
                    System.out.println("Type a new Hour");
                    medicApp.hour = sc.next();
                    System.out.println(medicApp.changeHour());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Sorry, not found :(((");
            }
        }
    }
}
