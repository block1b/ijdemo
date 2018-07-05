package dao.mydb;
import model.db.Course;

import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public interface CourseDao {

    /**
     * @return
     */
    public int add(Course r)throws SQLException;

    /**
     * @return
     */
    public int update(Course r)throws SQLException;

    /**
     * @return
     */
    public int delete(Course r)throws SQLException;

    /**
     * @return
     */
    public List<Course> findall()throws SQLException;

}