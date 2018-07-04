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

    public Role(int id, String roleid, String rolename, String permissions) {
        this.id = id;
        this.roleid = roleid;
        this.rolename = rolename;
        this.permissions = permissions;
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

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleid='" + roleid + '\'' +
                ", rolename='" + rolename + '\'' +
                ", permissions='" + permissions + '\'' +
                '}';
    }
}