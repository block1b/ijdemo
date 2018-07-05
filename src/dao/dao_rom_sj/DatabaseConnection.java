package dao.dao_rom;
import java.sql.*;  

public class DatabaseConnection {

   private static final String Driver="org.hsqldb.jdbcDriver";  
   private static final String URL="jdbc:hsqldb:hsql://localhost/mydb";  
   private static final String USER="SA";  
   private static final String PWD="";  
   private Connection conn=null;  
   
   public DatabaseConnection()throws Exception{  //在构造方法中进行数据库连接  
	   try{  
	       Class.forName(Driver);   //加载驱动类  
	       this.conn=DriverManager.getConnection(URL,USER,PWD);  
	   }catch(Exception e){  
	       System.out.println(e);;          //直接抛出异常  
	       }  
   }  
   
   public Connection getConnection()throws Exception{    
       return this.conn;  //取得数据库的连接  
   }  
   
   public void close()throws Exception{  //数据库关闭  
   if(this.conn!=null){     //避免NullPointerException  
   try{  
       this.conn.close();  //数据库关闭  
           }catch(Exception e){  
               throw e;  
           }  
       }  
   }   
	
}
