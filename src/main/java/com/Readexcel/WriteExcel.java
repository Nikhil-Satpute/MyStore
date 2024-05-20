package com.Readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

public void writeExcel(String sheetname, String cellvalue, int row, int col) throws Exception {
	
String excelpath = "C:\\Users\\NikhilSatpute\\eclipse-workspace\\MyStore\\TestData\\TestData.xlsx";

File file = new File(excelpath);

FileInputStream fis = new FileInputStream(file);                     // read data excelsheet

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheet(sheetname);
sheet.getRow(row).createCell(col).setCellFormula(excelpath);

FileOutputStream fos = new FileOutputStream(new File(excelpath));	// write data excelsheet

wb.write(fos);
wb.close();
fos.close();	
}	
}
