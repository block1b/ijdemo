package model.form;

import model.db.User;

public class Register extends User {
    private String repassword;

    public Register() {

    }

    public Register(int id, String uesrid, String username, String password, String classname, String roleid, String repassword) {
        super(id, uesrid, username, password, classname, roleid);
        this.repassword = repassword;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", uesrid='" + getUserid() + '\'' +
                ", username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", classname='" + getClassname() + '\'' +
                ", roleid='" + getRoleid() + '\'' +
                ", repassword='" + repassword + '\'' +
                '}';
    }
}
