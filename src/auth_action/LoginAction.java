package auth_action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import model.db.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware{

    private User user;
    private Map<String,Object> session;
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String execute() throws Exception {
        String user_name = user.getUsername();
        String user_password = user.getPassword();
        System.out.println("Username:" + user_name);
        System.out.println("passworld:" + user_password);
        System.out.println(user.toString());  // 该方法需要重写
        session.put("MSG", "登陆表单提交成功！");
        if("admin".equals(user_name)) {
            session.put("user", user);

            return "admin";
        }
        session.put("MSG", "登陆失败！");
        return ERROR;
    }

    // 登出
    public String logout() throws Exception {
        try {
            session.remove("user");
            session.put("MSG", "登出成功！");
            return SUCCESS;
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println("loger is none");
        }
        session.put("MSG", "登出失败！");
        return ERROR;
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public void setSession(Map<String,Object> arg0) {
        session = arg0;
    }
}
