package model.db;

import java.util.*;

/**
 * 
 */
public class Topic {

    /**
     * Default constructor
     */
    public Topic() {
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
    private String serveid;

    /**
     * 
     */
    private String topicid;

    /**
     * 
     */
    private String topicname;

    public String getServeid() {
        return serveid;
    }

    public void setServeid(String serveid) {
        this.serveid = serveid;
    }

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }
}