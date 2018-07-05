package dao.mydb;
import model.db.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public class UserDaoImpl implements UserDao {

    /**
     * Default constructor
     */
    public UserDaoImpl() {
    }

    /**
     * @return
     */
    public int add(User r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//        user(id,userid,username,password,classname,roleid)
        String sql = "insert into User(userid,username,password, classname,roleid)values(?,?,?, ?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getUserid());
            ps.setString(2, r.getUsername());
            ps.setString(3, r.getPassword());

            ps.setString(4, r.getClassname());
            ps.setString(5, r.getRoleid());
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
    public int update(User r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        user(id,userid,username,password,classname,roleid)
        String sql = "update User set userid=?,username=?,password=?,classname=?,roleid=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getUserid());
            ps.setString(2, r.getUsername());
            ps.setString(3, r.getPassword());
            ps.setString(4, r.getClassname());
            ps.setString(5, r.getRoleid());
            ps.setInt(6, r.getId());
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
    public int delete(User r)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from User where id=?";
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
    public List<User> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User r = null;
        List<User> Users = new ArrayList<User>();
        String sql = "select id,userid,username,password, classname,roleid from User";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new User();
                r.setId(rs.getInt(1));
                r.setUserid(rs.getString(2));
                r.setUsername(rs.getString(3));
                r.setPassword(rs.getString(4));
                r.setPassword(rs.getString(5));
                r.setPassword(rs.getString(6));
                Users.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Users;
    }

}