package dao;


import java.util.*;

/**
 * 
 */
public class Student{

    /**
     * Default constructor
     */
    public Student() {
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private int id;
    private String pass;


    /**
     * @param int id 
     * @param String name
     */
    public Student(int id, String name, String pass) {
        // TODO implement here
    	setId(id);
    	setName(name);
    	setPass(pass);
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

}