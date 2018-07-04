package dao.mydb;
import model.db.Topic;

import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public interface TopicDao {

    /**
     * @return
     */
    public int add(Topic r)throws SQLException;

    /**
     * @return
     */
    public int update(Topic r)throws SQLException;

    /**
     * @return
     */
    public int delete(Topic r)throws SQLException;

    /**
     * @return
     */
    public List<Topic> findall()throws SQLException;

}