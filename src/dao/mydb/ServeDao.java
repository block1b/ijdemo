package dao.mydb;
import model.db.Serve;

import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public interface ServeDao {

    /**
     * @return
     */
    public int add(Serve r)throws SQLException;

    /**
     * @return
     */
    public int update(Serve r)throws SQLException;

    /**
     * @return
     */
    public int delete(Serve r)throws SQLException;

    /**
     * @return
     */
    public List<Serve> findall()throws SQLException;

}