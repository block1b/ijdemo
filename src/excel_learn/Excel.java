package excel_learn;

import java.io.FileInputStream;

import java.io.InputStream;

import jxl.Cell;

import jxl.Sheet;

import jxl.Workbook;

import jxl.WorkbookSettings;

public class Excel {



    /**

     * @param args

     */

    public static void main(String[] args) {



        try {

            WorkbookSettings ws = new WorkbookSettings();

// ws.setEncoding("UTF-8");

            InputStream is = new FileInputStream("d:/aaa.xls"); // savePath是文件的绝对路径如c:/aa.xls



            jxl.Workbook wb = Workbook.getWorkbook(is); // 得到工作薄



            jxl.Sheet[] sts = wb.getSheets(); // 获得所有的工作表



            for (jxl.Sheet st : sts) { // 得到工作薄中的第一个工作表 （有多个表的时候遍历sts）

                int rsRows = st.getRows(); // 得到excel的总行数

                int columncount = st.getColumns();// 获得excel的总列数

                System.out.println("共" + rsRows + "行 " + columncount + "列");

                for (int i = 0; i < rsRows; i++) {

                    Cell cell0 = st.getCell(0, i);// 得到工作表的第一个单元格,即A1

                    Cell cell1 = st.getCell(1, i);// 得到工作表的第二个单元格,即B1

                    String str1 = cell0.getContents(); // 获得单元格内的内容

                    String str2 = cell1.getContents(); // 获得单元格内的内容

                    System.out.println(str1);

                    System.out.println(str2);

                    System.out.println(new String(str2.getBytes("GBK"),"UTF-8"));

                    System.out.println(new String(str2.getBytes("GB2312")));

                }

            }



            Sheet st1 = wb.getSheet(2);// 获得第一个工作薄



            Sheet stname = wb.getSheet("user");// 获得指定工作簿



        } catch (Exception e) {

            e.printStackTrace();

        }

    }



}