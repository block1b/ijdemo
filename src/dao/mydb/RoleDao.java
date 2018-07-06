package dao.mydb;
import model.db.Role;

import java.sql.SQLException;
import java.util.*;

/**
 * 
 */
public interface RoleDao {

    /**
     * @return
     */
    public int add(Role r)throws SQLException;

    /**
     * @return
     */
    public int update(Role r)throws SQLException;

    /**
     * @return
     */
    public int delete(Role r)throws SQLException;

    /**
     * @return
     */
    public List<Role> findall()throws SQLException;
    public Role findbyid(int id)throws SQLException;

}