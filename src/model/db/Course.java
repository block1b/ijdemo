package model.db;

import java.util.*;

/**
 * 
 */
public class Course {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Default constructor

     */
    public Course() {
    }
    private int id;
    /**
     * 
     */
    private String courseid;

    /**
     * 
     */
    private String coursename;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}