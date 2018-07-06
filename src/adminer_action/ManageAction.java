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
    private int id;
    private List<String> rowid;  // 多选
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

    public List<String> getRowid() {
        return rowid;
    }

    public void setRowid(List<String> rowid) {
        this.rowid = rowid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String execute() throws Exception {
        return SUCCESS;
    }

    // selectall
    public String findall() throws Exception{
        RoleDao rd = new RoleDaoImpl();
        List<Role> roles = rd.findall();
        System.out.println("-----------表查询结果---------");
        for(Role role:roles){
            System.out.println(role.toString());
        }
        session.put("table",roles);
        return SUCCESS;
    }
    // select by id
    public String findbyid() throws Exception{
        int id = this.id;
        System.out.println("id:" + id);
        RoleDao rd = new RoleDaoImpl();
        Role role = rd.findbyid(id);
        System.out.println("-----------role查询结果---------");
        System.out.println(role.toString());
        session.put("update_table",role);
        return SUCCESS;
    }

    public String update()throws Exception{

        System.out.println("update page get new" + role.toString());
        //插入数据库
        return SUCCESS;
    }

    public String create()throws Exception{
        try {
            System.out.println("create page get new" + role.toString());
            //写入数据库
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

        return ERROR;
    }

    public String delete()throws Exception{
        int id = this.id;
        Role r = new Role();
        r.setId(id);
        System.out.println("delete role id :" + id);
        RoleDao rd = new RoleDaoImpl();
        rd.delete(r);

        return SUCCESS;
    }

    public String deletes()throws Exception{
        System.out.println("delete more rowid:" + rowid);
        RoleDao rd = new RoleDaoImpl();
        for(String id : rowid){
            Role r = new Role();
            r.setId(Integer.parseInt(id));
            rd.delete(r);
        }
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
