package Ejercicio11;

public class ejercicio11 {
    public byte numero;

    public void asignarNumero(byte next){
        this.numero = next;
    }

    public String resultado(){
        if (numero < 0){
            return "The number " + numero + " is negative";
        }else {
            return "The number " + numero + " is positive";
        }
    }
}
