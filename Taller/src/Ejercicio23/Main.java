package Ejercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio23 sandwichOrder = new ejercicio23();
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Qué tamaño de sandwich desea?");
        sandwichOrder.setTamaño(lector.next());
        System.out.println("¿Desea añadir pavo?");
        sandwichOrder.setPavo(lector.next());
        System.out.println("¿Desea añadir Tocineta");
        sandwichOrder.setTocineta(lector.next());
        System.out.println("¿Desea queso?");
        sandwichOrder.setQueso(lector.next());

        sandwichOrder.prep();

        System.out.println(sandwichOrder.orderPrice());
    }
}
