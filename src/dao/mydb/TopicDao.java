package dao.mydb;
import model.db.Topic;

import java.util.*;

/**
 * 
 */
public interface TopicDao {

    /**
     * @return
     */
    public int add();

    /**
     * @return
     */
    public int update();

    /**
     * @return
     */
    public int delete();

    /**
     * @return
     */
    public List<Topic> findall();

}