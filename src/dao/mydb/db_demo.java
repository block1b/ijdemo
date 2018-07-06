package dao.mydb;

import model.db.Role;
import model.db.Class;

import java.util.ArrayList;
import java.util.List;

public class db_demo {
    public static void main(String[] args) throws Exception {
        RoleDao rd = new RoleDaoImpl();
//        Role r = new Role(0,"2","admin","r");
//        rd.add(r);
//        List<Role> roles = rd.findall();
//        for(Role role:roles){
//            System.out.println(role.toString());
//        }
        Role r = rd.findbyid(2);
        System.out.println(r.toString());
//
////        ClassDao cd = new ClassDaoImpl();
////        Class c = new Class(0,"软件1503");
////        cd.delete(c);
////        cd.findall();
//        List<Class> classes = cd.findall();
//        for(Class aclass:classes){
//            System.out.println(aclass.toString());
//        }



    }


}
