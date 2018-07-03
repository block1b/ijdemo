package model;

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