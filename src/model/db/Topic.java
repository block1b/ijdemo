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

    public Topic(int id, String serveid, String topicid, String topicname) {
        this.id = id;
        this.serveid = serveid;
        this.topicid = topicid;
        this.topicname = topicname;
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

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", serveid='" + serveid + '\'' +
                ", topicid='" + topicid + '\'' +
                ", topicname='" + topicname + '\'' +
                '}';
    }
}