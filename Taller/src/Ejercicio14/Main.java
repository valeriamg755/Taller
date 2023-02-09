package Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio14 grades = new ejercicio14();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your Physics grade");
        grades.setPhysics(reader.nextDouble());
        System.out.println("Enter your Chemistry grade");
        grades.setChemistry(reader.nextDouble());
        System.out.println("Enter your Biology grade");
        grades.setBiology(reader.nextDouble());
        System.out.println("Enter your Mathematics grade");
        grades.setMaths(reader.nextDouble());
        System.out.println("Enter your Informatica grade");
        grades.setComputerScience(reader.nextDouble());
        System.out.println("Calculating your average...");
        System.out.println("His average is: "+ grades.finalGrade());
        System.out.println(grades.showMessage());
    }
}
