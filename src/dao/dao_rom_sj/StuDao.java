package dao.dao_rom;

import dao.Student;
import model.Student;

import java.util.Iterator;
import java.util.List;

public class StuDao extends Dao {
    protected static String table = "student";  // 数据库表名

    protected static String class_type = Student.class.getName(); // 数据模型的class

    public StuDao(){
        super(table, class_type);
    }

    public static void main(String [] args){

        StuDao dao = new StuDao();

        List <Object> user = dao.paginate(1, 20);

//        for(Object o:user){
//            Student s = (Student)o;
//           System.out.println (s.getName());
//        }

        Iterator user1 = dao.filter("id", "<10").filter("id", ">5").all();
        Student stu1 = (Student)dao.filter("id", "<10").filter("id", ">5").first();

        System.out.println (stu1.getName());

//        while(user1.hasNext()){
//            Student s = (Student)user1.next();
//            System.out.println (s.getName());
//        }

    }

}
