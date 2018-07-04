package dao.mydb;
import model.db.Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public class ClassDaoImpl implements ClassDao {

    /**
     * Default constructor
     */
    public ClassDaoImpl() {
    }

    /**
     * @return
     */
    public int add(Class r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//      class(id,classname)
        String sql = "insert into class(classname)values(?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, r.getClassname());

            rs = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("添加数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return rs;
    }

    /**
     * @return
     */
    public int update(Class r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        Class(id,Classid,Classname,permissions)
        String sql = "update Class set classname=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);

            ps.setString(1, r.getClassname());
            ps.setInt(2, r.getId());

            rs = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
//            // throw new SQLException("更新数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return rs;
    }

    /**
     * @return
     */
    public int delete(Class c)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from Class where classname=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,c.getClassname());
            rs = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException(" 删除数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return rs;
    }

    /**
     * @return
     */
    public List<Class> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Class r = null;
        List<Class> Classs = new ArrayList<Class>();
        String sql = "select id,classname from Class";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new Class();
                r.setId(rs.getInt(1));
                r.setClassname(rs.getString(2));

                Classs.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Classs;
    }

}