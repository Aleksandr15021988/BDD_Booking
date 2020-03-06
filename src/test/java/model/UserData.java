package model;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    private String emailAdress;
    private String password;

    public UserData(String emailAdress, String password) {
        this.emailAdress = emailAdress;
        this.password = password;
    }

    public String getEmailAdress(){
        return emailAdress;
    }

    public String getPassword() {
        return password;
    }

    public String getUserData(String userData) {
        Map<String, String> elements = new HashMap<String, String>();
        elements.put("Default User", getEmailAdress());
        elements.put("Default Password", getPassword());
        return elements.get(userData);
    }
}
