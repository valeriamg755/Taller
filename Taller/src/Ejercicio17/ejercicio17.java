package Ejercicio17;

public class ejercicio17 {
    public int type;
    public int day15 = 18000;
    public int day30 = 35000;
    public int month3 = 86000;
    public String howMuch(){
        if(type == 1){
            return "You will pay 18000 for 15 days";
        }else if(type == 2){
            return "You will pay 35000 for 30 days";
        }else if(type == 3){
            return "You will pay 86000 for 3 months";
        }else{
            return "Error";
        }
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
}
