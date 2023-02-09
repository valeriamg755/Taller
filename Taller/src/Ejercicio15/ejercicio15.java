package Ejercicio15;

public class ejercicio15 {
    public int number1;
    public int number2;
    public int number3;
    public String  max(){
        if(number1 > number2 & number1 > number3){
            return "The number 1";
        }else if(number2 > number1 & number2 > number3){
            return "The number 2";
        }else if(number3 > number1 & number3 > number2){
            return "The number 3";
        }else if(number1 == number2 & number1 > number3){
            return "The number 1 and 2 they are the higher";
        }else if(number1 > number2 & number1 == number3){
            return "The number 1 and 3 they are the higher";
        }else if(number2 == number3 & number2 > number1){
            return "The number 2 and 3 they are the higher";
        }else{
            return null;
        }

    }
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getNumber3() {
        return number3;
    }
    public void setNumber3(int number3) {
        this.number3 = number3;
    }
}
