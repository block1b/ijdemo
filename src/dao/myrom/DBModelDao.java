package dao.myrom;

import java.sql.SQLException;
import java.util.List;


public interface DBModelDao {
    //添加方法
    public void add()throws SQLException;

//    //更新方法
//    public void uobjdate(Object obj)throws SQLException;
//
//    //删除方法
//    public void delete(int id)throws SQLException;
//
//    //查找方法
//    public Object findById(int id)throws SQLException;

    //查找所有
    public List<Object> findAll()throws SQLException;

}