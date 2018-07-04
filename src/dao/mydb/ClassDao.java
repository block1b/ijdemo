package dao.mydb;
import model.db.Class;

import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public interface ClassDao {

    /**
     * @return
     */
    public int add(Class r)throws SQLException;

    /**
     * @return
     */
    public int update(Class r)throws SQLException;

    /**
     * @return
     */
    public int delete(Class r)throws SQLException;

    /**
     * @return
     */
    public List<Class> findall()throws SQLException;

}