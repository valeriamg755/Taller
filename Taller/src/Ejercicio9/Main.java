package Ejercicio9;

public class Main {
    public static void main(String args[]) {
        ejercicio9 ejereclamo = new ejercicio9();

        ejereclamo.numeroReclamo = 12344;
        ejereclamo.setNombrePersona("Eliptik");
        ejereclamo.setAsunto("shipping delay");
        ejereclamo.descripcionReclamos = "It was sent 7 days ago and it has not arrived";
        ejereclamo.setEstadoReclamo("in review");

        System.out.println(ejereclamo.validarEstadoReclamo());
        System.out.println(ejereclamo.mensajeRecepcionReclamo());
    }
}
