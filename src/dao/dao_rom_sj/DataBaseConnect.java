package dao.dao_rom;

import dao.Student;
import model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class DataBaseConnect {

    static String url = "jdbc:hsqldb:hsql://localhost/mydb";

    static String driver = "org.hsqldb.jdbc.JDBCDriver";

    static String user = "SA";

    static String primary_key = "id";

    static String password = "";

    static Connection conn = null;

    static {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int add(String table, Object object) {

        int id = (int) getFieldValueByName(primary_key, object);

        if(id != -1){
            try {
                return this.update(table, object);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        Field[] fields = object.getClass().getDeclaredFields();
        List<Object> list = new ArrayList<>();
        StringBuilder values = new StringBuilder(" values (");
        StringBuilder sql = new StringBuilder(String.format("insert into %s (", table));
        for (Field field : fields) {
            if (field.getName().equals(primary_key))
                continue;
            if (getFieldValueByName(field.getName(), object) == null)
                continue;
            sql.append(String.format("\"%s\",", field.getName().toUpperCase()));
            values.append("?,");
            list.add(getFieldValueByName(field.getName(), object));
        }
        sql.replace(sql.length() - 1, sql.length(), ")");
        values.replace(values.length() - 1, values.length(), ")");
        sql.append(values);
        System.out.println(sql);

        int rs = 0;

        try (PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {
            for (int i = 1; i <= list.size(); i ++) {
                pstmt.setObject( i, list.get(i-1));
            }
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public int update(String table, Object object) throws SQLException {

        int id = (int) getFieldValueByName(primary_key, object);

        if (id == -1) {
            return this.add(table, object);
        }

        int rs = 0;

        Field[] fields = object.getClass().getDeclaredFields();
        List<Object> list = new ArrayList<>();
        StringBuilder sql = new StringBuilder(String.format("update %s set ", table));
        for (Field field : fields) {
            if (field.getName().equals(primary_key))
                continue;
            if (getFieldValueByName(field.getName(), object) == null)
                continue;
            sql.append(String.format(" \"%s\" = ?,", field.getName().toUpperCase()));
            list.add(getFieldValueByName(field.getName(), object));
        }
        String temp = String.format(" where %s = ?", primary_key);
        sql.replace(sql.length() - 1, sql.length(), temp);
        System.out.println(sql);

        try (PreparedStatement pstmt = conn.prepareStatement(sql.toString())) {
            for (Object o : list) {
                pstmt.setObject(list.indexOf(o) + 1, o);
            }
            pstmt.setInt(list.size() + 1, id);
            rs = pstmt.executeUpdate();
        }
        return rs;
    }

    public List<Object> paginate(String table, int start, int rows, String model_class){

        String sql = String.format("select limit %d %d * from %s", start, rows, table);
        return this.query_filter(sql, model_class);

    }

    public int delete(String table, Object object) {
        int id = (int) getFieldValueByName(primary_key, object);

        if (id == -1) {
            return 0;
        }

        int rs = 0;

        String sql = String.format("delete from %s where %s = ?", table, primary_key);

        List<Object> list = new ArrayList<>();

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setObject(1, id);
            pstmt.setInt(list.size() + 1, id);
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public List<Object> query_filter(String sql, String model_class) {

        /*
         *
         *  根据类名动态创建对象
         *
         * */

        List<Object> list = new ArrayList<>();
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Class _class = Class.forName(model_class);
                    Object object = _class.newInstance();
                    for (Field field : object.getClass().getDeclaredFields()) {
                        String firstLetter = field.getName().substring(0, 1).toUpperCase();
                        String setter = "set" + firstLetter + field.getName().substring(1);
                        Method method = object.getClass().getDeclaredMethod(setter, field.getType());
                        method.invoke(object, rs.getObject(field.getName()));
                    }
                    list.add(object);
                }
            } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
        DataBaseConnect d = new DataBaseConnect();
        dao.Student user = new Student();
        for(int i=0;i<50;i++){
            user.setName(""+i);
            user.setPass("123");
            d.add("student", user);
        }



//        Method m = user.getClass().getMethod("setId", int.class);
//       // d.add("user", user);
//        m.invoke(user, 1231123133);
//        System.out.println(user.getId());
//        String sql = "select * from user where id > 1";
////        d.update("user", user);
//        d.delete("user",user);
//        List<Object> list = d.query_filter(sql, "model.User");
//        for (Object o : list) {
//            System.out.println(o.toString());
//        }

    }
}