package dao.mydb;
import model.db.Serve;

import java.util.*;

/**
 * 
 */
public interface ServeDao {

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
    public List<Serve> findall();

}