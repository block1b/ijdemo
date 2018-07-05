package model.excel;

import java.util.List;
import java.util.Map;

// 表格模型化
public class Excel {
    private String filename;
    private List<String> steels;
    private Map info;

    public Excel(){}

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<String> getSteels() {
        return steels;
    }

    public void setSteels(List<String> steels) {
        this.steels = steels;
    }

    public Map getInfo() {
        return info;
    }

    public void setInfo(Map info) {
        this.info = info;
    }
}
