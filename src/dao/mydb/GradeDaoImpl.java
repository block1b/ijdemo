package dao.mydb;
import model.db.Grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public class GradeDaoImpl implements GradeDao {

    /**
     * Default constructor
     */
    public GradeDaoImpl() {
    }

    /**
     * @return
     */
    public int add(Grade r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//        grade(id,serveid,userid,topicid,gd1,gd2,gd3,gd4,gdsum,comment,classrank,majorrank)
        String sql = "insert into Grade(serveid,userid,topicid, gd1,gd2,gd3,gd4, gdsum,comment, classrank,majorrank)values(?,?,?, ?,?,?,?, ?,?, ?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getServeid());
            ps.setString(2, r.getUserid());
            ps.setString(3, r.getTopicid());

            ps.setString(4, r.getGd1());
            ps.setString(5, r.getGd2());
            ps.setString(6, r.getGd3());
            ps.setString(7, r.getGd4());

            ps.setString(8, r.getGdsum());
            ps.setString(9, r.getComment());

            ps.setString(10, r.getClassrank());
            ps.setString(11, r.getMajorrank());
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
    public int update(Grade r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        Grade(
        String sql = "update Grade set serveid=?,userid=?,topicid=?, gd1=?,gd2=?,gd3=?,gd4=?, gdsum=?,comment=?, classrank=?,majorrank=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getServeid());
            ps.setString(2, r.getUserid());
            ps.setString(3, r.getTopicid());

            ps.setString(4, r.getGd1());
            ps.setString(5, r.getGd2());
            ps.setString(6, r.getGd3());
            ps.setString(7, r.getGd4());

            ps.setString(8, r.getGdsum());
            ps.setString(9, r.getComment());

            ps.setString(10, r.getClassrank());
            ps.setString(11, r.getMajorrank());

            ps.setInt(12, r.getId());

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
    public int delete(Grade r)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from Grade where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, r.getId());

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
    public List<Grade> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Grade r = null;
        List<Grade> Grades = new ArrayList<Grade>();
        String sql = "select id,serveid,userid,topicid, gd1,gd2,gd3,gd4, gdsum,comment, classrank,majorrank from Grade";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new Grade();
                r.setId(rs.getInt(1));
                r.setServeid(rs.getString(2));
                r.setUserid(rs.getString(3));
                r.setTopicid(rs.getString(4));

                r.setGd1(rs.getString(5));
                r.setGd2(rs.getString(6));
                r.setGd3(rs.getString(7));
                r.setGd4(rs.getString(8));

                r.setGdsum(rs.getString(9));
                r.setComment(rs.getString(10));

                r.setClassrank(rs.getString(11));
                r.setMajorrank(rs.getString(12));
                Grades.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Grades;
    }

}