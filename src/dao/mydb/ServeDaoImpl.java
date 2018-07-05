package dao.mydb;
import model.db.Serve;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public class ServeDaoImpl implements ServeDao {

    /**
     * Default constructor
     */
    public ServeDaoImpl() {
    }

    /**
     * @return
     */
    public int add(Serve r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//        serve(id,userid,courseid)
        String sql = "insert into Serve(userid,courseid)values(?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getUserid());
            ps.setString(2, r.getCourseid());

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
    public int update(Serve r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        Serve(id,Serveid,Servename,permissions)
        String sql = "update Serve set userid=?,courseid=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getUserid());
            ps.setString(2, r.getCourseid());
            ps.setInt(3, r.getId());

            rs = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("更新数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return rs;
    }

    /**
     * @return
     */
    public int delete(Serve r)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from Serve where userid=? and id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,r.getId());
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
    public List<Serve> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Serve r = null;
        List<Serve> Serves = new ArrayList<Serve>();
        String sql = "select id,userid,courseid from Serve";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new Serve();
                r.setId(rs.getInt(1));
                r.setUserid(rs.getString(2));
                r.setCourseid(rs.getString(3));

                Serves.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Serves;
    }

}