package dao.mydb;
import model.db.User;

import java.sql.SQLException;
import java.util.*;

/**
 *
 */
public interface UserDao {

    /**
     * @return
     */
    public int add(User r)throws SQLException;

    /**
     * @return
     */
    public int update(User r)throws SQLException;

    /**
     * @return
     */
    public int delete(User r)throws SQLException;

    /**
     * @return
     */
    public List<User> findall()throws SQLException;

}