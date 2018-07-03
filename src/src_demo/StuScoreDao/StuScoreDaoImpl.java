package StuScoreDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.StuScore;

public class StuScoreDaoImpl implements StuScoreDao {

	private Connection conn = null;
    private PreparedStatement pStmt = null;
    private ResultSet rs=null;
    
    public StuScoreDaoImpl(Connection conn) throws Exception{
    	this.conn = conn;
    }
    
    @Override
    public List<StuScore> getAllStuScore() throws Exception{
		List<StuScore> list = new ArrayList<StuScore>();  
		String sql="select * from stuscore";  
		this.pStmt=this.conn.prepareStatement(sql);//实例化PrepareStatement对象    
		rs = pStmt.executeQuery();
		while(rs.next()){
			String stuid = rs.getString(1);
            String stuname = rs.getString(2);  
            double java = rs.getDouble(3);  
            System.out.println("" + stuid +"," + stuname + "," + java);
            StuScore a_stuscore = new StuScore();
            a_stuscore.setStuid(stuid);
            a_stuscore.setStuname(stuname);
            a_stuscore.setJava(java);
            list.add(a_stuscore);
        }  
		
		this.pStmt.close();   //关闭PreparedStatement操作
		return list;
	}
    @Override
    public boolean delById(String stuid) throws Exception{
    	boolean isSuc=false;
		String sql="delete from stuscore where stuid=?";  
		this.pStmt=this.conn.prepareStatement(sql);//实例化PrepareStatement对象    
		this.pStmt.setString(1, stuid);//设置  
		int row=pStmt.executeUpdate();
	    isSuc=row>0;
		this.pStmt.close();   //关闭PreparedStatement操作
    	return isSuc;
    }
    @Override
    public boolean save(StuScore ss) throws Exception{
    	boolean isSuc=false;
		String sql="insert into stuscore(stuid, stuname, java) values(?,?,?)";  
		this.pStmt=this.conn.prepareStatement(sql);//实例化PrepareStatement对象    
		this.pStmt.setString(1, ss.getStuid());//设置  
		this.pStmt.setString(2, ss.getStuname());
		this.pStmt.setDouble(3, ss.getJava());
		int row=pStmt.executeUpdate();
	    isSuc=row>0;
		this.pStmt.close();   //关闭PreparedStatement操作
    	return isSuc;
    }
}
