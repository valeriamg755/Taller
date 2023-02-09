package Ejercicio20;

import java.util.Random;

public class Maní {
    public static void main(String[] args) {
        ejercicio20 pc = new ejercicio20();
        Random  rd = new Random();
        pc.pitido = rd.nextBoolean();
        pc.disc = rd.nextBoolean();
        pc.unit = rd.nextBoolean();

        System.out.println(pc.checkStatus());
    }
}
