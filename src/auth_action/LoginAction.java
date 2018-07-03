package auth_action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import model.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware{

    private User User;
    private Map<String,Object> session;
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public User getUser() {
        return User;
    }
    public void setUser(User User) {
        this.User = User;
    }

    public String execute() throws Exception {
        String User_name = User.getId();
        String User_pass = User.getPassword();
        System.out.println("Username:" + User_name);
        System.out.println("passworld:" + User_pass);
        System.out.println(User.toString());  // 该方法需要重写

        if("admin".equals(User_name)) {
            session.put("User", User);
            return SUCCESS;
        }
        
        return ERROR;
    }

    @Override
    public User getModel() {
        return User;
    }

    @Override
    public void setSession(Map<String,Object> arg0) {
        session = arg0;
    }
}
