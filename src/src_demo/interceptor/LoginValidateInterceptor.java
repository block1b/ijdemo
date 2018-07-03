package interceptor;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import model.Loger;

public class LoginValidateInterceptor extends AbstractInterceptor {

	protected Set<String> excludeMethods = Collections.emptySet();
	protected Set<String> includeMethods = Collections.emptySet();
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext actionContext = invocation.getInvocationContext();
		Map<String,Object> session = actionContext.getSession();
		try {
			Loger loger = (Loger)session.get("loger");
			String name = loger.getName();
			System.out.println("拦截器-姓名：" + name);
			String r_char = name.substring(name.length() - 1);
			if("n".equals(r_char)) {
				return invocation.invoke();
			}
			else {
				return Action.LOGIN;
			}
		}catch(Exception e) {
			System.out.println("session get loger error");
			return Action.LOGIN;
		}
		
		
	}

}
