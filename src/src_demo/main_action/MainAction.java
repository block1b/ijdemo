package main_action;

import java.sql.Connection;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import StuScoreDao.StuScoreDaoImpl;
import model.StuScore;
import mydao.DatabaseConnection;


public class MainAction extends ActionSupport {

	List<StuScore> stuscores;
	StuScore ss;
	public StuScore getSs() {
		return ss;
	}
	public void setSs(StuScore ss) {
		this.ss = ss;
	}
	String stuid;
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public List<StuScore> getStuscores() {
		return stuscores;
	}
	public void setStuscores(List<StuScore> stuscores) {
		this.stuscores = stuscores;
	}
	public String add() throws Exception {
		DatabaseConnection dc = new DatabaseConnection();
		Connection conn = dc.getConnection();
		StuScoreDaoImpl ssi = new StuScoreDaoImpl(conn);
		boolean isSuc=ssi.save(this.ss);
		return isSuc?SUCCESS:ERROR;
	}
	public String delete() throws Exception {
		DatabaseConnection dc = new DatabaseConnection();
		Connection conn = dc.getConnection();
		StuScoreDaoImpl ssi = new StuScoreDaoImpl(conn);
		boolean isSuc=ssi.delById(this.stuid);
	    return isSuc?SUCCESS:ERROR;
	}
	public String update() {
		return SUCCESS;
	}
	public String query() throws Exception {
		DatabaseConnection dc = new DatabaseConnection();
		Connection conn = dc.getConnection();
		StuScoreDaoImpl ssi = new StuScoreDaoImpl(conn);
		this.stuscores = ssi.getAllStuScore();
		return SUCCESS;
	}
	public String execute() throws Exception {
		return SUCCESS;
	}
}
