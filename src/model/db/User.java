package model.db;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    public User(int id, String uesrid, String username, String password, String classname, String roleid) {
        this.id = id;
        this.userid = uesrid;
        this.username = username;
        this.password = password;
        this.classname = classname;
        this.roleid = roleid;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public void setUesrid(String uesrid) {
        this.userid = uesrid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 
     */
    private String userid;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String classname;

    /**
     * 
     */
    private String roleid;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uesrid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", classname='" + classname + '\'' +
                ", roleid='" + roleid + '\'' +
                '}';
    }
}