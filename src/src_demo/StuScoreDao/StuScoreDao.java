package StuScoreDao;

import java.sql.SQLException;
import java.util.List;

import model.StuScore;

public interface StuScoreDao {

	List<StuScore> getAllStuScore() throws Exception;
	boolean delById(String stuid) throws Exception;
	boolean save(StuScore ss) throws Exception;
}
