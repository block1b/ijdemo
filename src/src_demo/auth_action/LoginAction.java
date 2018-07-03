package auth_action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import model.Loger;

public class LoginAction extends ActionSupport implements ModelDriven<Loger>, SessionAware{

	private Loger loger;
	private Map<String,Object> session;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Loger getLoger() {
		return loger;
	}
	public void setLoger(Loger loger) {
		this.loger = loger;
	}
	
	public String execute() throws Exception {
		String loger_name = loger.getName();
		String loger_pass = loger.getPass();
		System.out.println("Logername:" + loger_name);
		System.out.println("passworld:" + loger_pass);
		
		if("admin".equals(loger_name)) {
			session.put("loger", loger);
			return SUCCESS;
		}
		return ERROR;
	}
	
	@Override
	public Loger getModel() {
		return loger;
	}
	
	public void validate()
	{
		if (loger.getName().isEmpty())
		{
			addFieldError("loger.name", getText("error.name"));
		} 
		if (loger.getPass().isEmpty())
		{
			addFieldError("loger.pass",getText("error.pass"));
		} 
	}
	@Override
	public void setSession(Map<String,Object> arg0) {
		session = arg0;
	}
}
