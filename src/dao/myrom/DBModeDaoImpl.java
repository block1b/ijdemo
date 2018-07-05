package dao.myrom;


import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectDao的具体实现类
 * @author lamp
 *
 */
public class DBModeDaoImpl implements DBModelDao{

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    /**
     * 实现添加方法
     */
    
    public void add() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
//        role(id,roleid,rolename,permissions

        String sql = "insert into role(roleid,rolename,permissions)values(?,?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
//            ps.setString(1, p.getName());
//            ps.setInt(2, p.getAge());
//            ps.setString(3, p.getDescription());
            ps.setString(1, "2015001");
            ps.setString(2, "韩");
            ps.setString(3, "rw");
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("添加数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
    }

    /**
     * 查询所有数据
     */

    public List<Object> findAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Object p = null;
        List<Object> Objects = new ArrayList<Object>();
//        role(id,roleid,rolename,permissions)
        String sql = "select * from role";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Object();
//                p.setId(rs.getInt());
//                p.setName(rs.getString());
//                p.setAge(rs.getInt());
//                p.setDescription(rs.getString());
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                Objects.add(p);
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Objects;
    }

}