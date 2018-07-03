package dao;


import java.sql.SQLException;
import java.util.*;

import model.User;

/**
 * 
 */
public interface StudentDao{

    /**
     * @return
     */
    public boolean check(Student stu) throws Exception;
    public void selectall() throws Exception;
}