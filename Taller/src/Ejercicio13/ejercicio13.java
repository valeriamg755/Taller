package Ejercicio13;

public class ejercicio13 {
    public int numero;

    public void asignarNumero(int next){
        this.numero = next;
    }

    public String calculo(){
        if ((numero%2) == 0){
            return numero + " is even";
        }else{
            return numero + " is odd";
        }
    }
}
