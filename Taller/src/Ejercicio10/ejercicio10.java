package Ejercicio10;

public class ejercicio10 {
    public String nombre;
    public int numeroHoras;
    public int pagoHoras;


    public void asignarNombre(String next){
        this.nombre = next;
    }
    public void asignarHoras(int next){
        this.numeroHoras = next;
    }
    public void caluclarValorHoras(){
        if (numeroHoras < 10){
            pagoHoras = 30000;
        }else {
            pagoHoras = 33000;
        }
    }

    public int salarioTotal(){
        return pagoHoras * numeroHoras;
    }
}
