package dao.myrom;
// 未完待定2018年7月4日16点08分
import model.db.Role;

import java.lang.reflect.Field;

// 获取class的类名，成员，方法
public class ClassInfo {

    public static void main(String[] args) throws Exception {
        //通过obj拼出sql
        Object obj = new Role(1,"yuan","stu","r");
        Class c = obj.getClass();
        // 获取类名
        String obj_classname = c.getName();
        String sql;
        System.out.println("类名："+obj_classname);
        // 获取成员变量
        Field[] fs = c.getDeclaredFields();
        for (Field field : fs) {
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(fieldName);

        }
//        String sql = "insert into role(roleid,rolename,permissions)values(?,?,?)";
    }
}
