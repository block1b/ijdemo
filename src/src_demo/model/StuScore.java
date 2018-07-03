package model;

public class StuScore {

	private String stuid;
	private String stuname;
	private double java;
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	} 
	@Override
	public String toString() {
		 return "StuScore [stuid=" + stuid + " stuname=" + stuname + ", java=" + java + "]";
	}
}
