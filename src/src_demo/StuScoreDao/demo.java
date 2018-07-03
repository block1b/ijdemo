package StuScoreDao;

import java.sql.Connection;
import java.util.List;

import model.StuScore;
import mydao.DatabaseConnection;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//数据库stuscore，查询
		StuScore ss = new StuScore();
		ss.setStuid("123");
		ss.setStuname("zhi");
		ss.setJava(100);
		DatabaseConnection dc = new DatabaseConnection();
		Connection conn = dc.getConnection();
		StuScoreDaoImpl ssi = new StuScoreDaoImpl(conn);
		
//		//add
//		boolean isSuc = ssi.save(ss);
//		System.out.println("save:ss" + isSuc);
		//selectall
		List<StuScore> ssc = ssi.getAllStuScore();
		for(StuScore a_ss : ssc) {
			System.out.println(a_ss.toString());
		}
//		System.out.println("delete:" + ssi.delById("2015001"));
	}
}
