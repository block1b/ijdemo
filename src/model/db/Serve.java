package model.db;

import java.util.*;

/**
 * 
 */
public class Serve {

    /**
     * Default constructor
     */
    public Serve() {
    }
    /**
     * 
     */
    private int id;


    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    /**
     * 
     */
    private String userid;

    /**
     * 
     */
    private String courseid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserid() {
        return userid;
    }

    public String getCourseid() {
        return courseid;
    }

    @Override
    public String toString() {
        return "Serve{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", courseid='" + courseid + '\'' +
                '}';
    }
}