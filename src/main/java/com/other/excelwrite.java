package com.other;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * Created by liqiang28 on 2018/2/8.
 */
public class excelwrite {


    public static void main (String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        //创建表格
        Sheet sheet=workbook.createSheet("报警");

        FileOutputStream outputStream = new FileOutputStream("/Users/s/s/c.xls");
        BufferedReader br = new BufferedReader(new FileReader("/Users/s/s/d.txt"));

        String line = null;
        int number = 0;
        while ((line=br.readLine()) != null) {
//            System.out.println(line);
            String[] words = line.split(" ");

            System.out.println("每行的字段数据是： " + words.length);
            Row row = sheet.createRow(number++);
            for (int i = 0; i < words.length; ++i) {
                System.out.println(words[i] + " ");
                Cell cell=row.createCell(i);
                cell.setCellValue(words[i]);
            }
            System.out.println("");
        }
        workbook.write(outputStream);
        outputStream.flush();
    }

}
