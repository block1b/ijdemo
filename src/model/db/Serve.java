package model;

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
    private String serveid;

    public void setServeid(String serveid) {
        this.serveid = serveid;
    }

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

    public String getServeid() {
        return serveid;
    }

    public String getUserid() {
        return userid;
    }

    public String getCourseid() {
        return courseid;
    }
}