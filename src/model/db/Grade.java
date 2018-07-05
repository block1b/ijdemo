package model.db;

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

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", serveid='" + serveid + '\'' +
                ", userid='" + userid + '\'' +
                ", topicid='" + topicid + '\'' +
                ", gd1='" + gd1 + '\'' +
                ", gd2='" + gd2 + '\'' +
                ", gd3='" + gd3 + '\'' +
                ", gd4='" + gd4 + '\'' +
                ", gdsum='" + gdsum + '\'' +
                ", comment='" + comment + '\'' +
                ", classrank='" + classrank + '\'' +
                ", majorrank='" + majorrank + '\'' +
                '}';
    }

    public Grade(int id, String serveid, String userid, String topicid, String gd1, String gd2, String gd3, String gd4, String gdsum, String comment, String classrank, String majorrank) {
        this.id = id;
        this.serveid = serveid;
        this.userid = userid;
        this.topicid = topicid;
        this.gd1 = gd1;
        this.gd2 = gd2;
        this.gd3 = gd3;
        this.gd4 = gd4;
        this.gdsum = gdsum;
        this.comment = comment;
        this.classrank = classrank;
        this.majorrank = majorrank;
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

    public String getGdsum() {
        return gdsum;
    }

    public void setGdsum(String gdsum) {
        this.gdsum = gdsum;
    }

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