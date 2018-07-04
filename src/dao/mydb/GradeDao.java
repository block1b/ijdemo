package dao.mydb;
import model.db.Grade;

import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public interface GradeDao {

    /**
     * @return
     */
    public int add(Grade r)throws SQLException;

    /**
     * @return
     */
    public int update(Grade r)throws SQLException;

    /**
     * @return
     */
    public int delete(Grade r)throws SQLException;

    /**
     * @return
     */
    public List<Grade> findall()throws SQLException;

}