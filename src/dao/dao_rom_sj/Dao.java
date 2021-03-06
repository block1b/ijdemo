package dao.dao_rom;

import java.util.List;

public abstract class Dao {
    public int add(Object object) {
        return db.add(this.table, object);
    }

    public int delete(Object object) {
        return db.delete(this.table, object);
    }

    public List<Object> paginate(int start, int rows) {

        /*
         *  利用ORM实现简单的分页
         *
         *  start 开始行数
         *
         *  rows 为显示的行数
         *
         * */

        return db.paginate(this.table, start, rows, this.class_type);
    }

    protected String class_type;

    protected String table;

    protected static DataBaseConnect db = new DataBaseConnect();

    public Dao(String table, String class_type) {
        this.class_type = class_type;
        this.table = table;
    }

    public Result filter(String column, String filter) {

        if ((table == null || "".equals(table)) || (class_type == null || "".equals(class_type))) {
            try {
                throw new Exception("Table name or class type not define!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String sql = String.format("select * from %s where %s %s", this.table, column, filter);
        return new Result(db.query_filter(sql, this.class_type), this.class_type, sql);
    }
}