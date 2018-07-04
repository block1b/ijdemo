package dao.mydb;

import model.db.Class;

import java.util.*;

/**
 * 
 */
public interface ClassDao {

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
    public List<Class> findall();

}