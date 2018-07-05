package auth_action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import model.form.Register;

public class RegisterAction extends ActionSupport implements ModelDriven<Register>, SessionAware{

    private Register register;
    private Map<String,Object> session;
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public Register getRegister() {
        return register;
    }
    public void setRegister(Register register) {
        this.register = register;
    }

    public String execute() throws Exception {
//        String userid = register.getUserid();
//        String username = register.getUsername();
//        String userpassword = register.getPassword();
//        String repassword = register.getRepassword();
//        String classname = register.getClassname();
//        register.setRoleid("3");  // 数据库role表中3为学生

        System.out.println(register.toString());  // 该方法需要重写
        session.put("MSG", "注册表单提交成功！");
        // todo 保存至数据库

//        return ERROR;
        return SUCCESS;
    }

    @Override
    public Register getModel() {
        return register;
    }

    @Override
    public void setSession(Map<String,Object> arg0) {
        session = arg0;
    }
}
