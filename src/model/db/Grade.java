package model;

import java.util.*;

/**
 * 
 */
public class Grade {

    /**
     * Default constructor
     */
    public Grade() {
    }

    /**
     * 
     */
    private String serveid;

    /**
     * 
     */
    private String userid;

    /**
     * 
     */
    private String topicid;

    /**
     * 
     */
    private String gd1;

    /**
     * 
     */
    private String gd2;

    /**
     * 
     */
    private String gd3;

    /**
     * 
     */
    private String gd4;

    /**
     * 
     */
    private String gdsum;

    /**
     * 
     */
    private String comment;

    /**
     * 
     */
    private String classrank;

    /**
     * 
     */
    private String majorrank;

    public void setServeid(String serveid) {
        this.serveid = serveid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid;
    }

    public void setGd1(String gd1) {
        this.gd1 = gd1;
    }

    public void setGd2(String gd2) {
        this.gd2 = gd2;
    }

    public void setGd3(String gd3) {
        this.gd3 = gd3;
    }

    public void setGd4(String gd4) {
        this.gd4 = gd4;
    }

    public void setGdsum(String gdsum) {
        this.gdsum = gdsum;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setClassrank(String classrank) {
        this.classrank = classrank;
    }

    public void setMajorrank(String majorrank) {
        this.majorrank = majorrank;
    }

    public String getServeid() {

        return serveid;
    }

    public String getUserid() {
        return userid;
    }

    public String getTopicid() {
        return topicid;
    }

    public String getGd1() {
        return gd1;
    }

    public String getGd2() {
        return gd2;
    }

    public String getGd3() {
        return gd3;
    }

    public String getGd4() {
        return gd4;
    }

    public String getGdsum() {
        return gdsum;
    }

    public String getComment() {
        return comment;
    }

    public String getClassrank() {
        return classrank;
    }

    public String getMajorrank() {
        return majorrank;
    }
}