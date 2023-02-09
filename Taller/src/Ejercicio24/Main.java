package Ejercicio24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio24 juego21 = new ejercicio24();
        Scanner x = new Scanner(System.in);
        juego21.carta1Uno =    (int)(Math. random()*10+1);
        juego21.carta2Uno =    (int)(Math. random()*10+1);
        juego21.carta3Uno =    (int)(Math. random()*10+1);
        juego21.carta1Dos =    (int)(Math. random()*10+1);
        juego21.carta2Dos =    (int)(Math. random()*10+1);
        juego21.carta3Dos =    (int)(Math. random()*10+1);

        System.out.println("the game started...");
        System.out.println("Player 1 \n carta 1 :"+ juego21.carta1Uno + " card 2: "+ juego21.carta2Uno);
        System.out.println("Player 2 \n carta 1: "+ juego21.carta1Dos + " card 2: "+ juego21.carta2Dos);
        System.out.println("press any key to see results...");

        System.out.println("Player 1 \n card: 1 "+ juego21.carta3Uno);
        System.out.println("Player 2 \n card: 1 "+ juego21.carta3Dos);
        juego21.jugar();
    }
}
