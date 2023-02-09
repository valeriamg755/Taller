package Ejercicio21;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ejercicio21 ejercicio21 = new ejercicio21();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite el número de modelo del automovil");
        ejercicio21.setModelo(lector.nextInt());

        System.out.println(ejercicio21.avisoUsuario());
    }
}
