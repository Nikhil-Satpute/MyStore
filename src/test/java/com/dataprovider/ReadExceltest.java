package com.dataprovider;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Readexcel.ExcelLibrary;

public class ReadExceltest {

	
@Test	
public void resdexcelsheet() throws IOException {	
ExcelLibrary obj = new ExcelLibrary();
String datastring=obj.readData("Test", 5, 1);
System.out.println("The data is: "+datastring);	
}













}
