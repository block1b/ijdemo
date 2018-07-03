package mydao;
import java.sql.*;  
import java.util.*;


/**
 * 
 */
public class StudentDaoImpl implements StudentDao {

    private Connection conn = null;
    private PreparedStatement pStmt = null;
    private ResultSet rs=null;
    
	/**
     * Default constructor
     */
    public StudentDaoImpl(Connection conn) throws Exception{
    	this.conn = conn;
    }

    /**
     * @return
     * @throws SQLException 
     */
    public boolean check(Student stu) throws Exception {
        // TODO implement here
		boolean flag=false;    //定义标志位  
		String sql="select * from stu where name=? and pass=?";  
		this.pStmt=this.conn.prepareStatement(sql);//实例化PrepareStatement对象  
		this.pStmt.setString(1, stu.getName()); //设置  
		this.pStmt.setString(2, stu.getPass());//设置  
		rs = pStmt.executeQuery();
//		while(rs.next()){  
//            int id = rs.getInt(1);  
//            String name = rs.getString(2);  
//            String pass = rs.getString(3);  
//            System.out.println("" + id +"," + name + "," + pass);
//        }  
		flag = rs.next();
		this.pStmt.close();   //关闭PreparedStatement操作  
		return flag;  
    }

    public void selectall() throws Exception{  
		String sql="select * from user";  
		this.pStmt=this.conn.prepareStatement(sql);//实例化PrepareStatement对象    
		rs = pStmt.executeQuery();
		while(rs.next()){  
            int id = rs.getInt(1);  
            String name = rs.getString(2);  
            String pass = rs.getString(3);  
            System.out.println("" + id +"," + name + "," + pass);
        }  
		
		this.pStmt.close();   //关闭PreparedStatement操作    
    }
}