package dao.mydb;
import model.db.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public class CourseDaoImpl implements CourseDao {

    /**
     * Default constructor
     */
    public CourseDaoImpl() {
    }

    /**
     * @return
     */
    public int add(Course r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//        course(id,courseid,coursename)
        String sql = "insert into course(courseid,coursename)values(?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getCourseid());
            ps.setString(2, r.getCoursename());

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
    public int update(Course r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        course(id,courseid,coursename)
        String sql = "update course set courseid=?,coursename=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getCourseid());
            ps.setString(2, r.getCoursename());
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
    public int delete(Course r)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from Course where id=?";
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
    public List<Course> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Course r = null;
        List<Course> Courses = new ArrayList<Course>();
        String sql = "select id,Courseid,Coursename from Course";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new Course();
                r.setId(rs.getInt(1));
                r.setCourseid(rs.getString(2));
                r.setCoursename(rs.getString(3));

                Courses.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Courses;
    }

}