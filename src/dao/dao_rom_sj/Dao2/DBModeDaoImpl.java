
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.db.DBUtils;
import com.vae.dao.PersonDao;
import com.vae.domain.Person;

/**
 * PersonDao的具体实现类
 * @author lamp
 *
 */
public class PersonDaoImpl implements PersonDao{

    /**
     * 实现添加方法
     */
    @Override
    public void add(Person p) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "insert into person(name,age,description)values(?,?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(, p.getName());
            ps.setInt(, p.getAge());
            ps.setString(, p.getDescription());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("添加数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
    }

    /**
     * 更新方法
     */
    @Override
    public void update(Person p) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "update person set name=?,age=?,description=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(, p.getName());
            ps.setInt(, p.getAge());
            ps.setString(, p.getDescription());
            ps.setInt(, p.getId());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("更新数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
    }

    /**
     * 删除方法
     */
    @Override
    public void delete(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from person where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(,id);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException(" 删除数据失败");
        }finally{
            DBUtils.close(null, ps, conn);
        }
    }

    /**
     * 根据ID查询一个对象
     */
    @Override
    public Person findById(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Person p = null;
        String sql = "select name,age,description from person where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(, id);
            rs = ps.executeQuery();
            if(rs.next()){
                p = new Person();
                p.setId(id);
                p.setName(rs.getString());
                p.setAge(rs.getInt());
                p.setDescription(rs.getString());
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("根据ID查询数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return p;
    }

    /**
     * 查询所有数据
     */
    @Override
    public List<Person> findAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Person p = null;
        List<Person> persons = new ArrayList<Person>();
        String sql = "select id,name,age,description from person";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Person();
                p.setId(rs.getInt());
                p.setName(rs.getString());
                p.setAge(rs.getInt());
                p.setDescription(rs.getString());
                persons.add(p);
            }
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return persons;
    }

}