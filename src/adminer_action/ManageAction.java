package adminer_action;
// todo 先拿来做前端用

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;
import java.util.List;
import dao.mydb.RoleDao;
import dao.mydb.RoleDaoImpl;
import org.apache.struts2.interceptor.SessionAware;

import model.db.Role;

public class ManageAction extends ActionSupport implements ModelDriven<Role>, SessionAware{

    private Role role;
    private Map<String,Object> session;
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public String execute() throws Exception {
        // select * from role;
        RoleDao rd = new RoleDaoImpl();
        List<Role> roles = rd.findall();
        System.out.println("-----------表查询结果---------");
        for(Role role:roles){
            System.out.println(role.toString());
        }
        session.put("table",roles);
        ReflectModel rf = new ReflectModel(new Role());
        List<String> fields = rf.getFields();
        System.out.println(fields);
        session.put("table_head", fields);
        return SUCCESS;
    }

    @Override
    public Role getModel() {
        return role;
    }

    @Override
    public void setSession(Map<String,Object> arg0) {
        session = arg0;
    }
}
