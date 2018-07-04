package dao.mydb;
import model.db.Course;

import java.util.*;

/**
 * 
 */
public interface CourseDao {

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
    public List<Course> findall();

}