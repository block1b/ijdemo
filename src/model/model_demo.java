package model;

import model.form.Register;

public class model_demo {
    public static void main(String[] args) throws Exception {
        //    Register rg = new RegisterRegister(int id,  String uesrid,String username, String password,String classname,  String roleid,String repassword);
        Register re = new Register(1,"1","1","1","1","1","1");
        System.out.println(re.toString());
    }


}
