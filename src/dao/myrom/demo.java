package dao.myrom;
import model.db.Role;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        DBModelDao dd = new DBModeDaoImpl();
//        dd.add(new Role());
//        dd.findAll();
        ((DBModeDaoImpl) dd).setObj(new Role());
        Object obj = ((DBModeDaoImpl) dd).getObj();
        System.out.println(obj.getClass().getName());

        // 获取自己声明的方法
        System.out.println("*************获取自己声明的方法*************");
        Class c = obj.getClass();
        Method[] ms = c.getDeclaredMethods();
        for(int i = 0; i < ms.length;i++){
            //得到方法的返回值类型的类类型
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName()+" ");
            //得到方法的名称
            System.out.print(ms[i].getName()+"(");
            //获取参数类型--->得到的是参数列表的类型的类类型
            Class[] paramTypes = ms[i].getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName()+",");
            }
            System.out.println(")");
        }

        // 获取成员变量的信息
        System.out.println("************获取成员变量的信息**************");
        Field[] fs = c.getDeclaredFields();
        for (Field field : fs) {
            //得到成员变量的类型的类类型
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName+" "+fieldName);
        }

    }
}
