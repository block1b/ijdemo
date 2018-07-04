package dao.mydb;

import model.db.Role;

import java.util.ArrayList;
import java.util.List;

public class db_demo {
    public static void main(String[] args) throws Exception {
        RoleDao rd = new RoleDaoImpl();
        Role r = new Role(1,"1","teacher","r");
        rd.update(r);
        List<Role> roles = rd.findall();
        for(Role role:roles){
            System.out.println(role.toString());
        }
    }


}
