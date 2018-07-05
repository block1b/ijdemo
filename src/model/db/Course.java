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

    public Course(int id, String courseid, String coursename) {
        this.id = id;
        this.courseid = courseid;
        this.coursename = coursename;
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

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseid='" + courseid + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }
}