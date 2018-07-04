package model.db;

import java.util.*;

/**
 * 
 */
public class Role {

    public String getRoleid() {
        return roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    /**
     * Default constructor
     */
    public Role() {

    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     */
    private String roleid;

    /**
     * 
     */
    private String rolename;

    /**
     * 
     */
    private String permissions;

}