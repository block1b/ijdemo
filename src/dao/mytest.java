package dao;

import java.sql.Connection;


public class mytest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//参数student，查询
//		Student stu = new Student(1, "han", "123456");
//		System.out.println("" + stu.getId() + "," + stu.getName() + "," + stu.getPass());
		DatabaseConnection dc = new DatabaseConnection();
		Connection conn = dc.getConnection();
		StudentDaoImpl sdi = new StudentDaoImpl(conn);
		sdi.selectall();
	}
}
