package auth_action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class LogoutAction implements SessionAware{

	private Map<String,Object> session;
	//登出
	public String logout() throws Exception {
		try {
			session.remove("loger");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("loger is none");
		}
		return "index";
	}
	@Override
	public void setSession(Map<String,Object> arg0) {
		session = arg0;
	}
}

