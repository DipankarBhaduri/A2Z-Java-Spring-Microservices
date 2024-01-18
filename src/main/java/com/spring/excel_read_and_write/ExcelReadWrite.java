package com.spring.excel_read_and_write;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.UUID;

public class ExcelReadWrite {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Self-Progress\\A2Z-Java-Spring-Microservices\\target\\excel_1.xlsx";
        writeInSheet("sheet1", "", "", path);
    }

    public static void writeInSheet (String sheetName, String userName,
                                     String password, String path) throws IOException {
        OutputStream outputStream = new FileOutputStream(path);
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(sheetName);
        addRowValue(sheet, 0, "SL. NO", "User_Name", "Password", "Status");
        for (int i = 1; i < 100000; i++) {
            String val = UUID.randomUUID().toString();
            addRowValue(sheet, i, String.valueOf(i), val, val, "");
        }
        workbook.write(outputStream);
        workbook.close();
        System.out.println("created successfully");
    }

    private static void addRowValue(Sheet sheet, int rowNum, String zeroThRow, String firstRow,
                                    String secondRow, String thiredRow) {
        Row rowHead = sheet.createRow(rowNum);
        rowHead.createCell(0).setCellValue(zeroThRow);
        rowHead.createCell(1).setCellValue(firstRow);
        rowHead.createCell(2).setCellValue(secondRow);
        rowHead.createCell(3).setCellValue(thiredRow);
    }
}
