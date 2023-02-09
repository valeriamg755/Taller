package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio3 loanBooks = new ejercicio3();
        loanBooks.codLoan = 43;
        loanBooks.dateLoan = "12/02";
        loanBooks.nameBook = "";
        loanBooks.daysLoan = 30;
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int option;

        while (!exit) {

            System.out.println("1. Check Status");
            System.out.println("2. Check Data ");
            System.out.println("3. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println(loanBooks.checkStatus());
                    break;
                case 2:
                    System.out.println(loanBooks.checkData());
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Not Found");
            }
        }
    }
}
