package dao.mydb;
import model.db.Topic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public class TopicDaoImpl implements TopicDao {

    /**
     * Default constructor
     */
    public TopicDaoImpl() {
    }

    /**
     * @return
     */
    public int add(Topic r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
//        topic(id,serveid,topicid,topicname)
        String sql = "insert into Topic(serveid,topicid,topicname)values(?,?,?)";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getServeid());
            ps.setString(2, r.getTopicid());
            ps.setString(3, r.getTopicname());
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
    public int update(Topic r)throws SQLException {
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        //        Topic(id,serveid,topicid,topicname)
        String sql = "update Topic set serveid=?,topicid=?,topicname=? where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, r.getServeid());
            ps.setString(2, r.getTopicid());
            ps.setString(3, r.getTopicname());

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
    public int delete(Topic r)throws SQLException{
        // TODO implement here
        int rs = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from Topic where id=?";
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
    public List<Topic> findall() throws SQLException{
        // TODO implement here
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Topic r = null;
        List<Topic> Topics = new ArrayList<Topic>();
        String sql = "select id,serveid,topicid,topicname from Topic";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                r = new Topic();
                r.setId(rs.getInt(1));
                r.setServeid(rs.getString(2));
                r.setTopicid(rs.getString(3));
                r.setTopicname(rs.getString(4));

                Topics.add(r);
            }
        }catch(SQLException e){
            e.printStackTrace();
            // throw new SQLException("查询所有数据失败");
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return Topics;
    }

}