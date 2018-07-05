package dao.dao_rom;


import java.sql.SQLException;
import java.util.*;

import dao.Student;
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