package Ejercicio1;

import java.util.Objects;

public class ejercicio1 {
    public String BaseUser;
    public String LoginUser;
    public String KeywordUser;
    public String LoginKey;
    public boolean SystemStatus;

    public String checkStatus(){
        if (SystemStatus){
            return "The system is in good condition";
        } else {
            return "The system is in bad condition";
        }
    }

    public boolean getAcces() {
        if (Objects.equals(BaseUser, LoginUser) && Objects.equals(KeywordUser, LoginKey)) {
            return true;
        } else {
            return false;
        }

    }
}
