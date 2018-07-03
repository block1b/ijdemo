package auth_action;

import com.opensymphony.xwork2.ActionSupport;

import model.User;

public class RegisterAction extends ActionSupport {

	private User user = new User();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception {  
        System.out.println("call method execute");  
        return SUCCESS;  
    } 
}
