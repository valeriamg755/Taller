package Ejercicio4;

public class ejercicio4 {
    public  String color;
    public boolean status;

    public String changeColor(){
        return "The traffic lights are " + color;
    }

    public String statusLight(){
        if (status == true){
            return "Turn On";
        }else {
            return "Turn Off";
        }
    }

    public String showMessage() {
        if (color.equals("Green")) {
            return "Start";
        } else if (color.equals("Red")) {
            return "Stop";
        } else {
            return "Wtf...???";
        }
    }
}
