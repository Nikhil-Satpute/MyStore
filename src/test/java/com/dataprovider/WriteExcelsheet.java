package com.dataprovider;

import org.testng.annotations.Test;

import com.Readexcel.WriteExcel;

public class WriteExcelsheet {

WriteExcel obj = new WriteExcel();

@Test
public void writeexcelsheet() throws Exception {
	obj.writeExcel("Test", "Male", 0, 3);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
