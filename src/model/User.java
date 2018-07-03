package model;

public class User {
    static String id;
    static String password;


    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {

        User.id = id;
    }

    public void setPassword(String password) {
        User.password = password;
    }

}
