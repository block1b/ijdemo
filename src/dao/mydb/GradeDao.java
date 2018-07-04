package dao.mydb;
import model.db.Grade;

import java.util.*;

/**
 * 
 */
public interface GradeDao {

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
    public List<Grade> findall();

}