package Ejercicio20;

public class ejercicio20 {
    public boolean pitido;
    public boolean  disc;
    public boolean unit;

    public String checkStatus(){
        if (pitido == true && disc == true){
            return "damaged";
        } else if (pitido == true && unit == true ) {
            return "Technical Contact ";
        } else if (pitido == true && unit == false) {
            return "Verify unit contacts";
        } else if (pitido == false && disc == false){
            return "Take it to repair center";
        } else if (pitido == false && disc == true) {
            return "Check speaker connections";
        }
        return null;
    }
}
