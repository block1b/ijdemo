package dao.myrom;

import java.sql.Connection;

public class demo {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        //参数student，查询

        DatabaseConnection dc = new DatabaseConnection();
        Connection conn = dc.getConnection();
        DBModelDao dd = new DBModeDaoImpl(conn);


    }
}
