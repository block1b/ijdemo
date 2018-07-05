package adminer_action;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ReflectModel {
    Object obj;

    public ReflectModel() {

    }
    public ReflectModel(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public List<String> getFields(){
        List<String> fields = new ArrayList<>();
        Class c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field field : fs) {
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(""+fieldName);
            fields.add(fieldName);
        }
        return fields;
    }
}
