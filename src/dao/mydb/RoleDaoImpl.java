package dao.mydb;
import model.db.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * 
 */
public class RoleDaoImpl implements RoleDao {

    /**
     * Default constructor
     */
    public RoleDaoImpl() {
    }

    /**
     * @return
     */
    public int add(Role r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//        role(id,roleid,rolename,permissions)
        String sql = "insert into role(roleid,rolename,permissions)values(?,?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getRoleid());
            ps.setString(2, r.getRolename());
            ps.setString(3, r.getPermissions());
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
    public int update(Role r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        role(id,roleid,rolename,permissions)
        String sql = "update role set roleid=?,rolename=?,permissions=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getRoleid());
            ps.setString(2, r.getRolename());
            ps.setString(3, r.getPermissions());
            ps.setInt(4, r.getId());
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
    public int delete(Role r)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from role where id=?";
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
    public List<Role> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Role r = null;
        List<Role> roles = new ArrayList<Role>();
        String sql = "select id,roleid,rolename,permissions from role";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new Role();
                r.setId(rs.getInt(1));
                r.setRoleid(rs.getString(1));
                r.setRolename(rs.getString(2));
                r.setPermissions(rs.getString(3));
                roles.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return roles;
    }

}