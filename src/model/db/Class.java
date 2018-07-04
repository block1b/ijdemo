package model.db;

import java.util.*;

/**
 * 
 */
public class Class {
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * Default constructor
     */
    public Class() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    /**
     * 
     */
    private String classname;

}